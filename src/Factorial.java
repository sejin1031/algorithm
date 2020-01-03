import java.util.Scanner;

public class Factorial {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int result = 1;
        while(n > 0) {
            result *= n--;
        }
        System.out.println(result);
    }
}
