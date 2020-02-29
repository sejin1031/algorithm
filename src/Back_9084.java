import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_9084 {
    static int[] ans;
    static int[] coins;
    static int money;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String... args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        ans = new int[T];
        for(int i = 0;i<T;i++){
            ans[i] = dp();
        }
        for (int i:ans) System.out.println(i);
    }

    static int dp() throws IOException{
        int N = Integer.parseInt(br.readLine());
        coins = new int[N];
        int[] dp = new int[10001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<N;i++){
            coins[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        dp[0] = 1;
        for(int i = 0;i<N;i++){
            for(int j = coins[i];j<=M;j++){
                dp[j] += dp[j-coins[i]];
            }
        }
        return dp[M];
    }
}
