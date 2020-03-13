import java.io.*;

public class Back_11718 {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";
        for (int i = 0;i<100;i++){
            str = br.readLine();
            if(str.equals("")) break;
            bw.write(str);
            bw.newLine();
        }
        bw.flush();
    }
}
