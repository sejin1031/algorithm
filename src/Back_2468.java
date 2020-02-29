import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_2468 {
    static class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    static int N;
    static boolean[] height = new boolean[101];
    static int[][] map;
    static int curRain;
    static boolean[][] visited;
    static int max_area = 0;
    static int cur_area = 0;

    static int[] x = {1,-1,0,0};
    static int[] y = {0,0,1,-1};

    public static void main(String... args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        for(int i = 0;i<N;i++){
            StringTokenizer st =  new StringTokenizer(br.readLine());
            for(int j = 0; j<N;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                height[map[i][j]] = true;
            }
        }
        height[0] = true;
        for(int h = 0;h<=100;h++){
            if(!height[h]) continue;
            else {
                visited = new boolean[N][N];
                cur_area = 0;
                curRain = h;
                for(int i = 0;i<N;i++){
                    for(int j = 0;j<N;j++){
                        if(!visited[i][j] && map[i][j] > curRain) {
                            cur_area++;
                            dfs(i,j);
                        } else visited[i][j] = true;
                    }
                }
                max_area = Math.max(cur_area,max_area);
            }
        }
        System.out.print(max_area);
    }
    static void dfs(int i , int j){
        visited[i][j] = true;

        for(int dir = 0;dir<4;dir++){
            int xx = i + x[dir];
            int yy = j + y[dir];
            if(xx<0 || yy < 0 || xx >= N || yy >= N) continue;
            else{
                if(map[xx][yy] > curRain && !visited[xx][yy]){
                    dfs(xx,yy);
                }
            }
        }

    }
}
