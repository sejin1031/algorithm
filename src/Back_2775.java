import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Back_2775 {
    public static void main(String... args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = sc.nextInt();
        for(int i = 0; i < T ; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int[] down = new int[b+1];
            int[] up = new int[b+1];
            // 0층작업
            for(int j = 1 ; j <= b; j++) {
                down[j] = j;
            }
            for(int j = 1; j <= a ; j++) {
                int sum = 0;
                for(int k = 1; k<=b; k++) {
                    sum += down[k];
                    up[k] = sum;
                }
                down = Arrays.copyOf(up,b+1);
            }
            bw.write(Integer.toString(down[b]));
            bw.newLine();
        }
        bw.flush();
    }
}
