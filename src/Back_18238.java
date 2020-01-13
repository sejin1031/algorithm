import java.util.Scanner;

public class Back_18238 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        String ans = scn.next();
        int sum = 0;
        char cur = 'A';
        char next = 'Z';
        for(int i = 0;i<ans.length();i++){
            next = ans.charAt(i);
            sum += Math.min(Math.abs(cur-next),26-(Math.abs(cur-next)));
            cur = ans.charAt(i);
        }
        System.out.print(sum);
    }
}
