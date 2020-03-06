import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Back_5554 {
    public static void main(String... args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        for(int i = 0;i<4;i++) sum += Integer.parseInt(br.readLine());
        int M = sum/60;
        int S = sum % 60;
        bw.write(Integer.toString(M));
        bw.newLine();
        bw.write(Integer.toString(S));
        bw.flush();
    }
}
