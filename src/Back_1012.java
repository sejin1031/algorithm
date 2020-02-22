import java.util.Scanner;

public class Back_1012 {
    static int N;
    static int M;
    static int[][] baechu;
    static boolean[][] visited;
    static int[] count;
    static int[] x = {0,0,1,-1};
    static int[] y = {1,-1,0,0};
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        count = new int[scn.nextInt()];
        for(int i = 0;i<count.length;i++){
            M = scn.nextInt();
            N = scn.nextInt();
            baechu = new int[N][M];
            visited =  new boolean[N][M];
            int v = scn.nextInt();
            for(int j = 0;j<v;j++){
                int r = scn.nextInt();
                int c = scn.nextInt();
                baechu[c][r] = 1;
            }
            for(int j = 0;j<N;j++){
                for(int k = 0; k < M; k++){
                    if(!visited[j][k] && baechu[j][k] == 1){
                        count[i]++;
                        dfs(j,k);
                    }
                }
            }
        }
        for(int i : count) System.out.println(i);

    }
    static void dfs(int i, int j){
        visited[i][j] = true;
        for(int k = 0;k<4;k++){
            int xx = i + x[k];
            int yy = j + y[k];
            if(xx >= 0 && xx < N && yy >= 0 && yy < M
            && !visited[xx][yy] && baechu[xx][yy] == 1){
                dfs(xx,yy);
            }
        }
    }

}
