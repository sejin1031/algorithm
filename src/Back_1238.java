import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1238 {
    static int N,M,X;
    static int[][] graph;
    static int INF = 1000000;

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        graph = new int[N+1][N+1];
        for(int i = 1;i<=N;i++){
            for(int j = 1;j<=N;j++){
                if(i==j) continue;
                graph[i][j] = INF;
            }
        }
        for(int i = 0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph[a][b] = Math.min(graph[a][b],cost);
        }

        for(int k = 1;k<=N;k++){
            for(int i = 1;i<=N;i++){
                if(graph[i][k] == INF) continue;
                for(int j = 1;j<=N;j++){
                    if(graph[k][j] == INF) continue;
                    graph[i][j] = graph[i][j] == INF ? graph[i][k] + graph[k][j] :
                            Math.min(graph[i][j],graph[i][k] + graph[k][j]);
                }
            }
        }
        int max = 0;
        for(int i = 1;i<=N;i++){
            max = Math.max(max,graph[i][X]+graph[X][i]);
        }
        System.out.print(max);
    }
}
