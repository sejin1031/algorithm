import java.util.Scanner;

public class Back_11048 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        int[][] candy = new int[N+1][M+1];
        int[][] dp = new int[N+1][M+1];
        for(int i = 1;i<=N;i++){
            for(int j = 1;j<=M;j++){
                candy[i][j] = scn.nextInt();
            }
        }
        for(int i = 1;i<=N;i++) dp[i][1] = dp[i-1][1] + candy[i][1];
        for(int i = 1;i<=M;i++) dp[1][i] = dp[1][i-1] + candy[1][i];
        for(int i = 2;i<=N;i++){
            for(int j = 2;j<=M;j++){
                dp[i][j] = Math.max(Math.max(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1]) + candy[i][j];
            }
        }
        System.out.println(dp[N][M]);
    }
}
