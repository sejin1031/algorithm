import java.util.Scanner;

public class Fib {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] fib = new long[n+1];
        fib[0] = 0;
        if(n>=1) 
            fib[1] = 1;
        if(n>=2) {
            for(int i = 2;i<=n;i++) {
                fib[i] = fib[i-1] + fib[i-2];
            }
        }
        System.out.print(fib[n]);
        scn.close();
    }
}
