import java.util.Arrays;
import java.util.Scanner;

public class Back_2631 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        int[] dp = new int[N];
        for(int i = 0;i<N ;i++) {
            dp[i] = 1;
            num[i] = sc.nextInt();
        }
        for(int i = 0;i<N;i++){
                for(int j = i-1;j>=0;j--){
                    if(num[j] < num[i]){
                        dp[i] = Math.max(dp[j] + 1,dp[i]);
                    }
            }
        }
        System.out.print(N-Arrays.stream(dp).max().getAsInt());
    }
}
