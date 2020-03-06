import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Back_5576 {
    public static void main(String... args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] W = new int[10];
        int[] K = new int[10];
        for(int i = 0;i<10;i++) W[i] = Integer.parseInt(br.readLine());
        for(int i = 0;i<10;i++) K[i] = Integer.parseInt(br.readLine());
        Arrays.sort(W);
        Arrays.sort(K);
        int Wtot = W[7]+W[8]+W[9];
        int Ktot = K[7]+K[8]+K[9];
        bw.write(Integer.toString(Wtot)+" "+Integer.toString(Ktot));
        bw.flush();

    }
}
