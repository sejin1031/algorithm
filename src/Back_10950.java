import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_10950 {
    public static void main(String... args) throws IOException {
        int T,A,B;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            sb.append(A+B);
            if(i<T-1) sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
