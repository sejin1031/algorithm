import java.util.Scanner;

public class Back_15486 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] T = new int[N+51];
        int[] P = new int[N+51];
        int[] dp = new int[N+51];
        for(int i = 1;i<=N;i++){
            T[i] = scn.nextInt();
            P[i] = scn.nextInt();
        }
        for(int i = 1;i<=N;i++){
            dp[i + T[i]] = Math.max(dp[i] + P[i],dp[i+T[i]]);
            dp[i+1] = Math.max(dp[i],dp[i+1]);
        }
        System.out.println(dp[N+1]);
    }
}