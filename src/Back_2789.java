import java.util.Scanner;

public class Back_2789 {
    public static void main(String... args){
        String exclude =  "CAMBRIDGE";
        String word = (new Scanner(System.in)).next();
        String ans = "";
        for(int i = 0;i<word.length();i++){
            if(exclude.indexOf(word.charAt(i)) == -1){
                ans += Character.toString(word.charAt(i));
            }
        }
        System.out.print(ans);
    }
}
