import java.util.Scanner;

public class Back_1330 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();int b = scn.nextInt();
        if(a>b){
            System.out.print(">");
        }else if(a<b){
            System.out.print("<");

        }else{
            System.out.print("==");
        }
    }
}
