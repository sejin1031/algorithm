import java.util.Scanner;

public class Back_9507 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        long[] ans = new long[T];
        long[] fib = new long[68];
        fib[0] = fib[1] = 1; fib[2] = 2; fib[3] = 4;
        for(int i = 0;i < T; i++){
            int n = scn.nextInt();
            for(int j = 4; j<=n; j++){
                fib[j] = fib[j-1] + fib[j-2] + fib[j-3] + fib[j-4];
            }
            ans[i] = fib[n];
        }
        for (long i:ans) System.out.println(i);
    }
}
