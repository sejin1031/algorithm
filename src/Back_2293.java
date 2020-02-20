import java.util.Scanner;

public class Back_2293 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] coins = new int[n];
        int[] dp = new int[100000];
        dp[0] = 1;
        for(int i = 0;i<n;i++) coins[i] = scn.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 1;j<=k;j++){
                if(j >= coins[i]) dp[j] += dp[j-coins[i]];
            }
        }
        System.out.print(dp[k]);
    }
}
