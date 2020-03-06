import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_5063 {
    public static void main(String... args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] ans = new String[N];
        for(int i = 0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int no_ad = Integer.parseInt(st.nextToken());
            int profit = Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken());
            int diff = profit - no_ad;
            ans[i] = diff>0?"advertise":diff==0?"does not matter":"do not advertise";
        }
        for(String i:ans) System.out.println(i);
    }
}
