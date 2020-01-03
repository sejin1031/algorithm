import java.util.Scanner;

public class Star2 {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        for(int i = 0;i<num;i++) {
            for(int j=num-i-1;j>0;j--) {
                System.out.print(" ");
            }
            for(int k = 0;k<i+1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
