import java.util.Scanner;
import static java.lang.System.*;

public class Back_1436 {
    public static void main(String... args){
        Scanner scn = new Scanner(in);
        int N = scn.nextInt();
        int count = 0;
        int num = 1;
        while(true){
            String str = Integer.toString(num);
            if(str.contains("666")){
                count++;
                if(count == N) break;
            }
            num++;
        }
        out.println(num);
    }
}
