import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Back_2523 {
    public static void main(String... args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = sc.nextInt();
        for(int i = 1;i<=N;i++){
            for(int a = 1;a<=i;a++){
                bw.write("*");
            }
            bw.newLine();
        }
        for(int i = N-1;i>=1;i--){
            for(int a = 1;a<=i;a++){
                bw.write("*");
            }
            if(i>1) bw.newLine();
        }
        bw.flush();
    }
}
