import java.util.Scanner;

public class Back_2675 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        String[] strs = new String[T];
        for(int i = 0;i<T;i++) strs[i] = "";
        for(int i = 0;i<T;i++){
            int repeat = scn.nextInt();
            String[] str = scn.next().split("");
            for(int j =0;j<str.length;j++){
                for(int k = 0;k<repeat;k++){
                    strs[i] += str[j];
                }
            }
        }
        for(String str:strs) System.out.println(str);
    }
}
