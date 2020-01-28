import java.util.Scanner;

public class Back_10987 {
    public static void main(String... args){
        String word = (new Scanner(System.in)).next();
        char[] vowel = {'a','e','i','o','u'};
        int count = 0;
        for(int i = 0;i<word.length();i++){
            for(int j = 0;j<5;j++){
                if(word.charAt(i) == vowel[j]) count++;
            }
        }
        System.out.println(count);
    }
}
