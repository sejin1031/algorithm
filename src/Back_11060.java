import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_11060 {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] maze = new int[N];
        int[] dp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N;i++){
            maze[i] = Integer.parseInt(st.nextToken());
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int i = 0;i<N;i++){
            if(dp[i] != Integer.MAX_VALUE){
                for(int j = 1;j<=maze[i];j++){
                    if(i + j < N) dp[i+j] = Math.min(dp[i]+1,dp[i+j]);
                }
            }

        }
        System.out.print(dp[N-1] == Integer.MAX_VALUE?-1:dp[N-1]);
    }
}
