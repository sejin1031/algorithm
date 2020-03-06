import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1669 {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int monkey = Integer.parseInt(st.nextToken());
        int dog = Integer.parseInt(st.nextToken());
        int diff = dog-monkey;
        int n = 0;
        for(int i = 1;Math.pow(i,2)<diff;i++) {
            n = i;
        }
        if(diff <= Math.pow(n,2) + n){
            System.out.print(2*n);
        } else{
            System.out.print(2*n+1);
        }

    }
}
