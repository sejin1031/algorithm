import java.util.Scanner;

public class Back_2908 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        String a = Integer.toString(scn.nextInt());
        String b = Integer.toString(scn.nextInt());
        String numA = "";
        String numB = "";
        for(int i = a.length()-1;i>=0;i--)  numA += a.charAt(i);
        for(int i = b.length()-1;i>=0;i--)  numB += b.charAt(i);
        int x = Integer.parseInt(numA);
        int y = Integer.parseInt(numB);
        System.out.println(Integer.max(x,y));
    }
}
