import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_11058 {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        long[] dp = new long[101];
        for(int i = 1;i<=7;i++) dp[i] = i;
        for(int i = 7;i<=N;i++){
            for(int j = 3;j<i-1;j++){
                long cur = dp[i-j] * (j-1);
                if(cur > dp[i]) dp[i] = cur;
            }
        }
        System.out.print(dp[N]);
    }
}
