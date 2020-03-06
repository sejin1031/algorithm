import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_10162 {
    public static void main(String... args) throws IOException {
        int A = 300;
        int B = 60;
        int C = 10;
        int[] ans = new int[3];
        int T = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        if(T >= A){
            ans[0] = T/A;
            T -= T/A * A;
        }
        if(T >= B){
            ans[1] = T/B;
            T -= T/B * B;
        }
        if(T>=C){
            ans[2] = T/C;
            T -= T/C * C;
        }
        if(T > 0) System.out.print(-1);
        else{
            for (int i : ans) System.out.print(i+" ");
        }


    }
}
