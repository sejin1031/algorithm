import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_10159 {
    static int N,M;
    static int[][] graph;
    static int start;
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        int[] ans = new int[N+1];
        graph = new int[N+1][N+1];
        for(int i = 0; i<M;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            graph[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
        }

        for (int k = 1; k <= N; k++)
            for (int i = 1; i <= N; i++)
                for (int j = 1; j <= N; j++)
                    if (graph[i][k]==1 && graph[k][j]==1) graph[i][j] = 1;

        for(int i = 1;i<=N;i++){
            int a = 0;
            for(int j = 1;j<=N;j++){
                if(i != j && graph[i][j] == 0 && graph[j][i] == 0){
                    a++;
                }
            }
            System.out.println(a);
        }
    }
}
