import java.util.Scanner;

public class Back_9095 {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
        int[] result = new int[test];
        for(int i = 0;i<test;i++) {
            int n = scn.nextInt();
            int[] dp = new int[n+1];
            for(int j = 1;j<=n;j++) {
                if(j == 1) dp[j] = 1;
                else if(j== 2) dp[j] = 2;
                else if(j==3) dp[j] = 4;
                else {
                    dp[j] = dp[j-3]+dp[j-2]+dp[j-1];
                }
            }
            result[i] = dp[n];
        }
        for(int i:result) System.out.println(i);
        scn.close();
    }
}
