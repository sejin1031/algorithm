import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back_11055 {
    public static void main(String... args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        int[] dp = new int[N];
        int[] sum_dp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<N;i++) nums[i] = sum_dp[i] =Integer.parseInt(st.nextToken());
        Arrays.fill(dp,1);
        sum_dp[0] = nums[0];
        for(int i = 1;i<N;i++){
            for(int j = 0;j<i;j++){
                if(nums[j] < nums[i]){
                    sum_dp[i] = Math.max(sum_dp[i],sum_dp[j]+nums[i]);
//                    Arrays.stream(dp).forEach(x->System.out.print(x+" "));
//                    System.out.println();
                }
            }
        }
        Arrays.sort(sum_dp);
        System.out.print(sum_dp[N-1]);
    }
}
