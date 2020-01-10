import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Back_11399 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] times = new int[N];
        for(int i = 0;i<N;i++) times[i] = scn.nextInt();
        sort(times);
        int cum = times[0];
        int result = times[0];
        for(int i = 1;i<N;i++){
            cum += times[i];
            result += cum;
        }
        System.out.println(result);
    }
}
