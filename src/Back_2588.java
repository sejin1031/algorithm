import java.util.Scanner;

public class Back_2588 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int[] ans = new int[4];
        int a = scn.nextInt();
        int b = scn.nextInt();
        String str = Integer.toString(b);
        for(int i = 0;i<3;i++){
            System.out.println( a * (str.charAt(2-i)-'0'));
        }
        System.out.println(a*b);
    }
}
