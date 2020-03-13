import java.io.*;
import java.util.StringTokenizer;

public class Back_11404 {
    static int n,m;
    static int[][] graph;


    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        graph = new int[n+1][n+1];
        for(int i = 0;i<m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int pay = Integer.parseInt(st.nextToken());
            graph[from][to] = (graph[from][to] == 0)? pay:Math.min(graph[from][to],pay);
        }

        for(int k = 1;k<=n;k++){
            for(int i = 1; i<=n; i++){
                if(graph[i][k] == 0) continue;
                for(int j = 1;j<=n;j++){
                    if(graph[k][j] == 0) continue;
                    graph[i][j] = graph[i][j] == 0 ?graph[i][k]+graph[k][j]:
                            Math.min(graph[i][j],graph[i][k]+graph[k][j]);
                }
            }
        }
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                bw.write(i==j?"0 ":Integer.toString(graph[i][j])+" ");
            }
            bw.newLine();
        }
        bw.flush();
    }
}
