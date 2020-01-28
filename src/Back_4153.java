import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Back_4153 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int[] three = new int[3];
        ArrayList<String> ans = new ArrayList<String>();
        while(true){
            three[0] = scn.nextInt();
            three[1] = scn.nextInt();
            three[2] = scn.nextInt();
            if(three[0] == 0 && three[1] == 0 && three[2] == 0) break;
            Arrays.sort(three);
            if(Math.pow(three[2],2) == Math.pow(three[0],2)+Math.pow(three[1],2)){
                ans.add("right");
            }
            else
                ans.add("wrong");
        }
        for(String str:ans){
            System.out.println(str);
        }
    }
}
