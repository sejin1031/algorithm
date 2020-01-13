import java.util.Scanner;

public class Back_2884 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int h = scn.nextInt();
        int m = scn.nextInt();
        if(m>=45){
            System.out.print(h+" "+(m-45));
        }
        else if(m < 45 && h >= 1){
            System.out.print((h-1)+" "+(60-(45-m)));
        }
        else{
            System.out.print(23+" "+(60-(45-m)));
        }
    }
}