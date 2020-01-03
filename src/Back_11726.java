import java.util.Scanner;

public class Back_11726 {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int[] dp = new int[1001];
        dp[1] = 1;dp[2]= 2;
        for(int i = 3; i<=n;i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }
        System.out.println(dp[n]);
    }
}
