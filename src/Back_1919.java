import java.util.Scanner;

public class Back_1919 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        String b = scn.next();
        int count = 0;
        char[] ch1 = new char[26];
        char[] ch2 = new char[26];
        for(int i = 0;i<a.length();i++) ch1[a.charAt(i)-97]++;
        for(int i = 0;i<b.length();i++) ch2[b.charAt(i)-97]++;
        for(int i = 0;i<26;i++){
            int diff = ch1[i] - ch2[i];
            count += diff >= 0 ? diff : (ch2[i] - ch1[i]);
        }
        System.out.print(count);

    }
}
