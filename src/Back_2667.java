import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Back_2667 {
    static int N;
    static int housenum;
    static int[][] house;
    static boolean[][] visited;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        N = scn.nextInt();
        house = new int[N][N];
        visited = new boolean[N][N];
        ArrayList<Integer> houseCount = new ArrayList<>();
        for(int i = 0;i<N;i++){
            String str = scn.next();
            String[] list = str.split("");
            for(int j = 0;j<N;j++){
                house[i][j] = Integer.parseInt(list[j]);
            }
        }

        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                if(house[i][j] == 1 && !visited[i][j]){
                    housenum = 0;
                    dfs(i,j);
                    houseCount.add(housenum);
                }
            }
        }
        System.out.println(houseCount.size());
        Collections.sort(houseCount);
        for (int i:houseCount) System.out.println(i);

    }
    public static void dfs(int i, int j){
        visited[i][j] = true;
        housenum++;
        for(int k = 0; k<4;k++){
            int xx = i + dx[k];
            int yy = j + dy[k];
            if(xx>=0 && xx < N && yy >= 0 && yy < N &&
                house[xx][yy] == 1 && !visited[xx][yy]){
                dfs(xx,yy);
            }
        }
    }
}
