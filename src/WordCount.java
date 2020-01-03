import java.util.Scanner;

public class WordCount {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        String sentence = scn.nextLine();
        String[] words = sentence.split(" ");
        int count = 0;
        for(String word:words) {
            if(!word.equals("")) count ++;
        }
        System.out.println(count);
        scn.close();
    }
}
