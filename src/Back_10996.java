import java.util.Scanner;

public class Back_10996 {
    public static void main(String... args){
        int N = (new Scanner(System.in)).nextInt();
        for(int i = 1;i<=2 * N;i++){
            for(int j = 1;j<=N;j++){
                System.out.print(j%2==i%2?"*":" ");
            }
            System.out.println();
        }
    }
}
