import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Back_2920 {
    public static void main(String... args){
        Scanner scn = new Scanner(in);
        int[] ar = new int[8];
        for(int i = 0;i<8;i++) ar[i] = scn.nextInt();
        int[] ac = {1,2,3,4,5,6,7,8};
        int[] dc = {8,7,6,5,4,3,2,1};
        if(Arrays.equals(ar,ac)){
            out.println("ascending");
        }
        else if(Arrays.equals(ar,dc)){
            out.println("descending");
    }
        else{
            out.println("mixed");
    }
}
}
