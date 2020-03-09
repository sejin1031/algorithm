import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2193 {
    public static void main(String... args) throws IOException {
        int N = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        long[][] dp = new long[91][2];
        dp[1][1] = 1;
        dp[2][1] = 1;
        dp[3][1] = 1;
        dp[3][0] = 1;
        for(int i = 3; i<N;i++){
            dp[i+1][0] = dp[i][0] + dp[i][1];
            dp[i+1][1] = dp[i][0];
        }
        System.out.print(dp[N][0]+dp[N][1]);
    }
}
