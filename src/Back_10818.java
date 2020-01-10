import java.util.Arrays;
import java.util.Scanner;

public class Back_10818 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] ar = new int[N];
        for(int i = 0;i<N;i++) ar[i] = scn.nextInt();
        Arrays.sort(ar);
        System.out.println(ar[0]+" "+ar[N-1]);
    }
}
