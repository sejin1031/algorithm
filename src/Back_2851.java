import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Back_2851 {
    public static void main(String... args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] mushrooms = new int[10];
        int sum = 0;
        int prev_sum = 0;
        for(int i = 0;i<10;i++) mushrooms[i] = Integer.parseInt(br.readLine());
        for(int i = 0;i<10;i++){
            sum += mushrooms[i];
            if(sum >=100){
                prev_sum = sum -mushrooms[i];
                break;
            }
        }
        bw.write(Integer.toString(sum-100<=100-prev_sum?sum:prev_sum));
        bw.flush();
    }
}
