import java.util.Scanner;

public class Back_1085 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int w = scn.nextInt();
        int h = scn.nextInt();
        System.out.print(Math.min(Math.min(x,Math.abs(w-x)),Math.min(y,Math.abs(h-y))));
    }
}
