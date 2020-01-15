import java.util.Scanner;

public class Back_10995 {
    public static void main(String... args){
        int N = (new Scanner(System.in)).nextInt();
        for(int i = 1;i<=N;i++){
            for(int j = 1;j<=2*N;j++){
                System.out.print(i%2==j%2?"*":" ");
            }
            System.out.println();
        }
    }
}
