import java.util.Scanner;

public class Nprint {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for(int i = N;i>0;i--) System.out.println(i);
    }
}
