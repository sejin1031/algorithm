import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_13458 {
    static long N,B,C;
    static long[] A;
    static long ans = 0;

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = new long[(int)N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<N;i++) A[i] = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());
        for(int i = 0;i< N ;i++){
            A[i] -= B;
            ans++;
        }
        for(int i = 0;i<N;i++){
            if(A[i] <= 0) continue;
            if(A[i] % C == 0) ans += A[i]/C;
            else{
                ans += A[i]/C + 1;
            }
        }
        System.out.print(ans);
    }
}
