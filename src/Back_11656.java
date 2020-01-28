import java.util.Arrays;
import java.util.Scanner;

public class Back_11656 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        String word = scn.next();
        String[] dic = new String[word.length()];
        for(int i = 0;i<dic.length;i++){
            dic[i] = word.substring(i);
        }
        Arrays.sort(dic);
        for(String wd:dic) System.out.println(wd);
    }
}
