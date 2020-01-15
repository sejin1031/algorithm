import java.util.Scanner;

public class Back_2445 {
    public static void main(String... args){
        int N = (new Scanner(System.in)).nextInt();
        for(int i = 1;i<=N;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for(int j = 1;j<=(N-i)*2;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = N-1;i>=1;i--){
            for(int j = i;j>0;j--){
                System.out.print("*");
            }
            for(int j = 1;j<=(N-i)*2;j++){
                System.out.print(" ");
            }
            for(int j = i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
