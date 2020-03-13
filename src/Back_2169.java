import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_2169 {
    static int N,M;
    static int[][] map;
    static int[][] dp;
    static int[][] tmp;

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N+1][M+1];
        dp = new int[N+1][M+1];
        tmp = new int[2][M+2];
        for(int i = 1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1;j<=M;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[1][1] = map[1][1];
        for (int i = 2;i<=M;i++) dp[1][i] = dp[1][i-1] + map[1][i];

        for (int i = 2;i<=N;i++){
            tmp[0][0] = dp[i-1][1];
            for (int j = 1; j<=M;j++){
                tmp[0][j] = Math.max(tmp[0][j-1],dp[i-1][j]) + map[i][j];
            }
            tmp[1][M+1] = dp[i-1][M];
            for (int j = M; j >= 1; j--)
                tmp[1][j] = Math.max(tmp[1][j + 1], dp[i - 1][j]) + map[i][j];

            for(int j=1;j<=M;j++)
                dp[i][j] = Math.max(tmp[0][j], tmp[1][j]);
        }
        System.out.print(dp[N][M]);
    }

}
