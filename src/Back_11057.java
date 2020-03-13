import java.util.Scanner;

public class Back_11057 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] dp = new int[N+1][10];
        for(int i = 0;i<10;i++) dp[1][i] = 1;
        for(int i = 2;i<=N;i++){
            for(int k = 0;k<10;k++){
                for(int j = k;j>=0;j--){
                    dp[i][k] += dp[i-1][j];
                    dp[i][k] %= 10007;
                }
            }

        }
        int sum = 0;
        for(int i = 0;i<10;i++) {
            sum += dp[N][i];
            sum %= 10007;
        }
        System.out.print(sum);
    }
}
