import java.util.Arrays;
import java.util.Scanner;

public class Back_1932 {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] triangle = new int[n+1][n+1];
        for(int i = 1;i<=n;i++) {
            for(int j = 1;j<=i;j++) {
                triangle[i][j] = scn.nextInt();
            }
        }
        for(int i = 2;i<=n;i++) {
            for(int j = 1;j<=i;j++) {
                if(j == 1)
                    triangle[i][j] += triangle[i-1][j];
                else if(j == i)
                    triangle[i][j] += triangle[i-1][j-1];
                else
                    triangle [i][j] += Math.max(triangle[i-1][j],triangle[i-1][j-1]);
            }
        }
        Arrays.sort(triangle[n]);
        System.out.println(triangle[n][n]);
    }
}
