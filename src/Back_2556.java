import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Back_2556 {
    public static void main(String... args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = sc.nextInt();
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                bw.write("*");
            }
            if(i<N-1) bw.newLine();
        }
        bw.flush();
    }
}
