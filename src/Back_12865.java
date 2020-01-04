import java.util.Scanner;

import static java.lang.System.*;

public class Back_12865 {
    public static void main(String... args){
        Scanner scn = new Scanner(in);
        int N = scn.nextInt();
        int K = scn.nextInt();
        int[] prices = new int[101];
        int[] weights = new int[101];
        int[] dp = new int[K+1];
        for(int i = 1;i<=N;i++){
            weights[i] = scn.nextInt();
        prices[i] = scn.nextInt();
    }
        for(int i = 1 ;i<=N;i++)
            for (int j = K; j - weights[i] >= 0; j--) {
                dp[j] = Math.max(dp[j], dp[j - weights[i]] + prices[i]);
            }
        out.println(dp[K]);
    }

}
