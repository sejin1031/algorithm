import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Back_4949 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        String sentence = "";
        while(true){
            String yn="yes";
            sentence = scn.nextLine();
            if(sentence.equals(".")) break;
            Stack<Character> stk = new Stack<Character>();
            for(int i = 0;i<sentence.length();i++){
                if(sentence.charAt(i) == '['){
                    stk.push(']');
                } else if(sentence.charAt(i) == '('){
                    stk.push(')');
                } else if(sentence.charAt(i) == ')'){
                    if(stk.isEmpty() || stk.pop() != ')'){
                        yn = "no";
                        break;
                    }
                }else if(sentence.charAt(i) == ']') {
                    if (stk.isEmpty() || stk.pop() != ']') {
                        yn = "no";
                        break;
                    }
                } else if(sentence.charAt(i) == '.'){
                    if(!stk.isEmpty()) yn = "no";
                    break;
                }
            }
            al.add(yn);
        }
        for(String str:al) System.out.println(str);
    }
}
