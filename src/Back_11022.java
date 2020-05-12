import java.io.*;
import java.util.StringTokenizer;

public class Back_11022 {
    public static void main(String... args) throws IOException {
        int T,A,B;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            bw.write("Case #"+Integer.toString(i+1)+": "+Integer.toString(A)+" + "+Integer.toString(B)+" = "+Integer.toString(A+B));
            if(i<T-1) bw.newLine();
        }
        bw.flush();
    }
}
