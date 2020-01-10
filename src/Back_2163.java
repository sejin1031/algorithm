import java.util.Scanner;

import static java.lang.System.*;

public class Back_2163 {
    public static void main(String... args){
        Scanner scn = new Scanner(in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        int[][] choco = new int[301][301];
        for(int i = 1;i<=N;i++) {
            choco[i][1] = i-1;
            choco[1][i] = i-1;
        }
        for(int i = 1;i<=N;i++){
            for(int j = 2;j<=M;j++){
                if(j>=i)
                    choco[i][j] = j * choco[i][1] + j-1;
                else
                    choco[i][j] = i * choco[1][j] + i-1;
            }
        }
        out.println(choco[M][N]);
    }
}
