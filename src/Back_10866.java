import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Back_10866 {
    public static void main(String... args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i = 0;i<N;i++){
            ans += Integer.parseInt(br.readLine()) == 0?-1:1;
        }
        System.out.print(ans>0?"Junhee is cute!":"Junhee is not cute!");
    }
}
