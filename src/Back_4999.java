import java.util.Scanner;

public class Back_4999 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        String me = scn.next();
        String doc = scn.next();
        System.out.print(me.length()>=doc.length()?"go":"no");
    }
}
