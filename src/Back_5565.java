import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Back_5565 {
    public static void main(String... args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());
        for(int i = 0;i<9;i++) sum -= Integer.parseInt(br.readLine());
        System.out.print(sum);
    }
}
