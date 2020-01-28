import java.util.Scanner;

public class Back_9935 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        String word = scn.next();
        String bomb = scn.next();
        String ans = "";
        for(int i = 0;i<word.length();i++){
            if(bomb.indexOf(word.charAt(i)) == -1){
                ans += Character.toString(word.charAt(i));
            }
        }
        System.out.print(ans == ""? "FRULA" : ans);
    }
}
