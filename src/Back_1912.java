import java.util.Scanner;

public class Back_1912 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        int[] dp = new int[n];
        for(int i = 0;i<n;i++) nums[i] = scn.nextInt();
        dp[0] = nums[0];
        for(int i = 1;i<n;i++){
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
        }
        int max = dp[0];
        for(int i = 0;i<n;i++) max = max<dp[i]?dp[i]:max;
        System.out.print(max);
    }
}