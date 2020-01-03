import java.util.Scanner;

public class Back_2579 {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] st = new int[n+1];
        int[][] result = new int[n+1][2];
        for(int i = 1; i<=n;i++) st[i] = scn.nextInt();
        result[1][0] = st[1];
                for(int i = 2;i<=n;i++) {
                    if(i == 2) {
                        result[i][0] = Math.max(result[i-1][0], result[i-1][1])+st[i];
                    }
                    else {
                result[i][0] = result[i-1][1]+st[i];
            }
            result[i][1] = Math.max(result[i-2][0], result[i-2][1])+st[i];
        }
        
        System.out.println(Math.max(result[n][0], result[n][1]));
        scn.close();
    }
}
