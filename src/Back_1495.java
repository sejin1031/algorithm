import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1495 {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] lists = new int[101];
            boolean[][] dp = new boolean[101][1050];
            st = new StringTokenizer(br.readLine());
            for(int i = 1;i<=N;i++) {
                lists[i] = Integer.parseInt(st.nextToken());
        }
        dp[0][S] = true;
        for(int i = 0;i<N;i++){
            for (int k = 0;k<=M;k++){
                if(dp[i][k]){
                    if(k + lists[i+1] <= M) dp[i+1][k+lists[i+1]] = true;
                    if(k - lists[i+1] >= 0) dp[i+1][k-lists[i+1]] = true;
                }
            }
        }
        int ans = -1;
        for(int i = 0;i<=M;i++){
            if(dp[N][i]) ans = i;
        }
        System.out.print(ans);
    }
}
