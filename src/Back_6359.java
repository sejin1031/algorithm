import java.util.Arrays;
import java.util.Scanner;

public class Back_6359 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        int[] ans = new int[T];
        for(int i = 0; i < T; i++){
            int n = scn.nextInt();
            for(int j = 1;Math.pow(j,2) <= n;j++){
                ans[i]++;
            }
        }
        Arrays.stream(ans).forEach(x->System.out.println(x));
    }
}
