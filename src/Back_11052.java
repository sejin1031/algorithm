import java.util.Scanner;

public class Back_11052 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] cards = new int[N+1];
        int[] dp = new int[N+1];
        for(int i = 1; i<=N;i++) cards[i] = scn.nextInt();
        dp[1] = cards[1];
        for(int i = 2;i<=N;i++){
            dp[i] = cards[i];
            for(int j = i-1,k=1;j>=k;j--,k++){
                if(dp[i] < dp[j]+ dp[k]){
                    dp[i] = dp[j] + dp[k];
                }
            }
        }
        System.out.println(dp[N]);
    }
}
