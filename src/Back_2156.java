import java.util.Scanner;

public class Back_2156 {

    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] wine = new long[10001];
        long[][] result = new long[10001][3];
        for(int i = 1;i<=n;i++) wine[i] = scn.nextLong();
            if(n>=3) {
                result[1][0] = wine[1];
                result[1][1] = wine[1];
                result[1][2] = 0;
                result[2][0] = wine[1] + wine[2]; 
                result[2][1] = wine[2];
                result[2][2] = wine[1];
                for(int i = 3;i<=n;i++) {
                    result[i][0] = result[i-1][1] + wine[i];
                    result[i][1] = Math.max(Math.max(result[i-2][0], result[i-2][1]),result[i-2][2]) + wine[i];
                    result[i][2] = Math.max(Math.max(result[i-1][0], result[i-1][1]),result[i-1][2]);
                }
            }
            
        
        if(n == 1) {
            System.out.println(wine[1]);
            return;
        }
        else if(n == 2) {
            System.out.println(wine[1]+wine[2]);
            return;
        }
        else {
            System.out.println(Math.max(Math.max(result[n][0], result[n][1]),result[n][2]));
            return;
        }
            
        
    }
}
