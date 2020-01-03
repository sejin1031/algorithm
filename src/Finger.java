import java.util.Scanner;

public class Finger {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n<= 5)
            System.out.println(n);
        else if((n-1) % 8 ==0)
            System.out.println(1);
        else if((n-2) % 8 == 0 || (n-8) % 8 == 0 && n>=8)
            System.out.println(2);
        else if((n-3) % 4 == 0)
            System.out.println(3);
        else if((n-4) % 8 == 0 || (n-6) % 8 == 0 && n>=6)
            System.out.println(4);
        else
            System.out.println(5);
        scn.close();
    }
}
