import java.util.Scanner;

public class Back_2902 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        String[] words = scn.next().split("");
        boolean hiphone = false;
        String result = words[0];
        for(int i = 1;i<words.length;i++){
            if(words[i].equals("-")){
                hiphone = true;
                continue;
            }
            if(hiphone) {
                result += words[i];
                hiphone = false;
            }
        }
        System.out.println(result);
    }
}
