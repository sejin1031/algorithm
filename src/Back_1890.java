import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1890 {
    static long dp[][], graph[][];
    static int N, x[] = {0,1}, y[] = {1,0};
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new long[N][N];
        graph = new long[N][N];
        for(int i = 0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0;j<N;j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }
        System.out.print(dfs(0,0));
    }
    static long dfs(int i,int j){
        if(i == N-1 && j == N-1)
            return 1;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        dp[i][j] = 0;
        for (int dir = 0;dir<2;dir++){
            int xx = (int) (i + x[dir] * graph[i][j]);
            int yy = (int) (j + y[dir] * graph[i][j]);
            if(xx<0 || yy< 0 || xx >= N || yy >= N) continue;
            dp[i][j] += dfs(xx,yy);
        }
        return dp[i][j];
    }
}
