import java.io.*;

public class Back_10707 {
    public static void main(String... args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());

        int X = A * P;
        int Y = P <= C?B:B+D*(P-C);
        bw.write(Integer.toString(Math.min(X,Y)));
        bw.flush();
    }
}
