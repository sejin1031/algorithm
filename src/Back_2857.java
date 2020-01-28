import java.util.Arrays;
import java.util.Scanner;

public class Back_2857 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        String[] names = new String[5];
        int count = 0;
        for(int i = 0; i < 5; i++) names[i] = scn.next();
        for(int i = 0;i<5;i++){
            if(names[i].indexOf("FBI") != -1){
                System.out.print((i+1) + " ");
                count++;
            }
        }
        if(count == 0) System.out.print("HE GOT AWAY!");
    }
}
