import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Back_5597 {
    public static void main(String... args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] check = new boolean[31];
        for(int i = 0;i<28;i++){
            check[Integer.parseInt(br.readLine())] = true;
        }
        for(int i = 1;i<=30;i++){
            if(!check[i]) System.out.println(i);
        }
    }
}
