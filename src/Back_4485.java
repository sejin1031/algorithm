import java.util.ArrayList;
import java.util.Scanner;

public class Back_4485 {
    static Scanner scn = new Scanner(System.in);
    public static void main(String... args){
        int n = 1;
        int count = 1;
        ArrayList<String> al = new ArrayList<>();
        while(true){
            n = scn.nextInt();
            if(n == 0) break;
            al.add("Problem " + count+": "+jelda(n));
        }
        for(String str:al) System.out.println(str);
    }
    static int jelda(int n){
        int[][] dp = new int[n][n];
        for(int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                dp[i][j] = scn.nextInt();
            }
        }
        for(int i = 1;i<n;i++){
            dp[i][0] += dp[i-1][0];
            dp[0][i] += dp[0][i-1];
        }
        for(int i = 1;i<n;i++){
            for(int j = 1;j<n;j++){
                dp[i][j] += Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n-1][n-1];
    }

}
