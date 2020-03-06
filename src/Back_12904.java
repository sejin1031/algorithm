import java.util.Scanner;

public class Back_12904 {
    public static void main(String... args){
        String S,T;
        Scanner scn = new Scanner(System.in);
        S = scn.next();
        T = scn.next();
        for (int i = T.length();i>S.length();i--){
            if(T.endsWith("A")){
                T = remove_A(T);
            } else T = remove_B(T);
        }
        System.out.print(S.equals(T)?1:0);

    }

    static String remove_A(String s){
        return s.substring(0,s.length()-1);
    }
    static String remove_B(String s){
        String str = s.substring(0,s.length()-1);
        String ans = "";
        for(int i = str.length()-1;i>=0;i--) ans += Character.toString(str.charAt(i));
        return ans;
    }

}
