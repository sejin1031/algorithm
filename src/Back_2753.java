import java.util.Scanner;

public class Back_2753 {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int Y = scn.nextInt();
        System.out.print((Y % 400 == 0 || Y % 4 == 0 && Y % 100 != 0)?1:0);
    }
}
