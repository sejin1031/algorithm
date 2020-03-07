import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back_11053 {
    public static void main(String... args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        int[] dp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<N;i++) nums[i] = Integer.parseInt(st.nextToken());
        Arrays.fill(dp,1);
        for(int i = 1;i<N;i++){
            dp[i] = 1;
            for(int j = 0;j<i;j++){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[j]+1,dp[i]);
//                    Arrays.stream(dp).forEach(x->System.out.print(x+" "));
//                    System.out.println();
                }
            }
        }
        Arrays.sort(dp);
        System.out.print(dp[N-1]);
    }
}
