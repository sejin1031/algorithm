import java.util.Scanner;

public class Back_2441 {
    public static void main(String... args){
        int N = (new Scanner((System.in)).nextInt());
        for(int i = N;i>0;i--){
            for(int j = N-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j = i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
