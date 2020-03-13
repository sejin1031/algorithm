import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_5567 {
    static int n,m;
    static int graph[][];
    static boolean[] visited;
    static int ans = 0;

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        graph = new int[n+1][n+1];
        visited = new boolean[n+1];
        for(int i = 0;i<m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }
        for(int i = 2;i<=n;i++){
            if(graph[1][i] == 1){
                visited[i] = true;
                ans++;
                for(int j = 2;j<=n;j++){
                    if(graph[i][j] == 1 && graph[1][j] != 1 &&!visited[j]){
                        visited[j] = true;
                        ans++;
                    }
                }
            }
        }
        System.out.print(ans);
    }
}
