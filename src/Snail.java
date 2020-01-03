import java.util.Scanner;

public class Snail {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        double v = scn.nextDouble();
        if(a==v) {
            System.out.println(1);
        }
        else {
            System.out.println((long)Math.ceil((v-a)/(a-b)+1));
        }
        
    }
}
