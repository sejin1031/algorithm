import java.util.Scanner;

import static java.lang.System.*;

public class Back_10809 {
    public static void main(String... args){
        Scanner scn = new Scanner(in);
        int[] indexs = new int[26];
        String word = scn.next();
        for(char c = 'a' ; c <= 'z' ; c++){
            indexs[c-97] = word.indexOf(Character.toString(c));
        }
        for(int i : indexs) out.print(i+" ");
    }
}
