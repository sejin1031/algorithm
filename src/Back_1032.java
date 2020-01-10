import java.util.Scanner;

public class Back_1032 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        String[] words = new String[N];
        for(int i = 0;i<N;i++) words[i] = scn.next();
        String[] same = words[0].split("");
        for(int i = 1;i<words.length;i++){
            String[] cmp = words[i].split("");
            for(int j = 0;j<cmp.length;j++){
                if(!cmp[j].equals(same[j])) same[j] = "?";
            }
        }
        for(String i : same) System.out.print(i);
    }
}
