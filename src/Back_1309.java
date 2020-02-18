import java.util.Arrays;
import java.util.Scanner;

public class Back_1309 {
    public static void main(String... args){
        int N = (new Scanner(System.in)).nextInt();
        int[][] dp = new int[N][3];
        dp[0][0] = dp[0][1] = dp[0][2] = 1;
        for(int i = 1;i<N; i++){
            dp[i][0] = (dp[i-1][0] + dp[i-1][1]+dp[i-1][2]) %9901;
            dp[i][1] = (dp[i-1][0] + dp[i-1][2]) % 9901;
            dp[i][2] = (dp[i-1][0] + dp[i-1][1]) % 9901;
        }
        System.out.println(Arrays.stream(dp[N-1]).sum() % 9901);

    }
}
