import java.util.Scanner;

public class FreqAlphabet {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        String word = scn.next().toUpperCase();
        int[] count = new int[26];
        int max = 0;
        char result = '?';
        
        for(int i = 0;i<word.length();i++) {
            count[word.charAt(i)-65]++;
            if(max<count[word.charAt(i)-65]) {
                max=count[word.charAt(i)-65];
                result = word.charAt(i);
            }
            else if(max== count[word.charAt(i)-65]) {
                result = '?';
            }
        }
        System.out.println(result);
        scn.close();
    }
}
