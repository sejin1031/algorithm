import java.util.Scanner;

public class Back_10808 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        String[] s = scn.next().split("");
        int[] count = new int[26];
        for(int i = 0;i<s.length;i++){
            count[s[i].charAt(0)-97]++;
        }
        for(int i:count) System.out.print(i+" ");
    }
}
