import java.util.Scanner;

public class Back_2443 {
    public static void main(String... args){
        int N = (new Scanner((System.in)).nextInt());
        for(int i = N;i>0;i--){
            for(int j = 0;j<N-i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<2 *i -1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
