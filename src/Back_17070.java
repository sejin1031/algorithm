import java.util.Scanner;

public class Back_17070 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[][] wall = new int[N][N];
        int[][][] dp = new int[N][N][3];
        for(int i = 0; i < N ;i++){
            for (int j = 0 ;j < N ; j++){
                wall[i][j] = scn.nextInt();
            }
        }
        dp[0][1][0] = 1;
        for(int i = 0;i<N;i++){
            for (int j = 1;j<N;j++){
                if(wall[i][j] + wall[i][j-1] == 0){
                    dp[i][j][0] += (dp[i][j-1][0] + dp[i][j-1][1]);
                }
                if(i-1 >=0 && j-1 >= 0 &&
                        wall[i][j] + wall[i-1][j] + wall[i][j-1] == 0){
                    dp[i][j][1] += (dp[i-1][j-1][0]
                            +dp[i-1][j-1][1]+
                            dp[i-1][j-1][2]);
                }
                if(i > 0 && wall[i-1][j] + wall[i][j] == 0){
                    dp[i][j][2] += (dp[i-1][j][2] + dp[i-1][j][1]);
                }
            }
        }
        System.out.println(dp[N-1][N-1][0]+dp[N-1][N-1][1]+dp[N-1][N-1][2]);

    }
}
