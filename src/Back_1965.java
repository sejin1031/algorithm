import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1965 {

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] boxes = new int[n];
        int[] dp = new int[n];

        int ans = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
            boxes[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0;i<n;i++){
            dp[i] = 1;
            for(int j = 0;j<i;j++){
                if(boxes[i] > boxes[j] && dp[j]+1 > dp[i]){
                    dp[i] = dp[j] + 1;
                }
            }
            ans = Math.max(dp[i],ans);
        }
        System.out.print(ans);
    }
}
