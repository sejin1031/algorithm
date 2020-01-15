import java.util.Scanner;

public class Back_10988 {
    public static void main(String... args){
        String word = (new Scanner(System.in)).next();
        int left = 0;
        int right = word.length()-1;
        int result = 1;
        while(left<right){
            if(word.charAt(left) != word.charAt(right)){
                result = 0;
                break;
            }
            left++;right--;
        }
        System.out.print(result);
    }
}
