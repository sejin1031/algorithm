import java.util.Arrays;
import java.util.Scanner;

public class Back_9465 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        int[] ans = new int[T];
        for(int i = 0; i<T;i++){
            int n = scn.nextInt();
            int[][] dp = new int[2][n];
            for(int j = 0; j<n;j++) dp[0][j] = scn.nextInt();
            for(int j = 0; j<n;j++)  dp[1][j] = scn.nextInt();
            if(n == 1) ans[i] = Math.max(dp[0][0],dp[1][0]);
            else{
                dp[0][1] += dp[1][0];
                dp[1][1] += dp[0][0];
                for(int j = 2; j < n; j++){
                    for(int k = 0; k < 2; k++){
                        dp[k][j] += Math.max(dp[k==0?1:0][j-1],
                                Math.max(dp[0][j-2],dp[1][j-2]));
                    }
                }
                ans[i] = Math.max(Math.max(dp[0][n-1],dp[1][n-1]),
                        Math.max(dp[0][n-2],dp[1][n-2]));
            }
        }
        Arrays.stream(ans).forEach(x->System.out.println(x));
    }
}
