import java.util.Scanner;

public class Back_2442 {
    public static void main(String... args){
        int N = (new Scanner((System.in)).nextInt());
        for(int i = 0;i<N;i++){
            for(int j = N - i - 1;j>0;j-- ){
                System.out.print(" ");
            }
            for(int j = 0;j<2 * i + 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
