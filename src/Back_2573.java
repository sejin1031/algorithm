import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_2573 {
    static int N,M;
    static int[][] map;
    static boolean[][] visited;
    static int year = 0;
    static int curIce = 1;
    static boolean flag = true;

    static int[] x = {1,-1,0,0};
    static int[] y = {0,0,1,-1};

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        map = new int[N][M];
        visited = new boolean[N][M];
        for(int i = 0 ; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0;j<M;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        while(curIce == 1){
            visited = new boolean[N][M];
            countIce();
            if(curIce >= 2){
                break;
            }
            curIce = 0;
            year++;
            melt();
            if(!check()) break;
        }
        System.out.print(year);
    }
    static void countIce(){
        for(int i = 0;i<N;i++){
            for(int j = 0;j<M;j++){
                if(!visited[i][j] && map[i][j] > 0){
                    curIce+= 1;
                    dfs(i,j);
                }
            }
        }
    }
    static void dfs(int i, int j){
        visited[i][j] = true;
        for(int dir = 0;dir<4;dir++){
            int xx = i + x[dir];
            int yy = j + y[dir];
            if(xx<0 || yy < 0 || xx >= N || yy >=M) continue;
            else if(!visited[xx][yy] && map[xx][yy]>0){
                dfs(xx,yy);
            } else{
                visited[xx][yy] = true;
            }
        }
    }
    static void melt(){
        for(int i = 0;i<N;i++){
            for (int j = 0;j<M;j++){
                if(map[i][j]  == 0) continue;
                for (int dir = 0;dir<4;dir++){
                    int xx = i + x[dir];
                    int yy = j + y[dir];
                    if(xx < 0 || yy < 0 || xx >= N || yy >= M) continue;
                    else{
                        if(map[xx][yy] == 0) map[i][j]--;
                    }
                }
                map[i][j] = map[i][j] <= 0 ? 0 : map[i][j];
            }
        }
    }
    static boolean check(){
        int num = 0;
        for(int i = 0;i<N;i++){
            for(int j = 0;j<M;j++){
                if(map[i][j] > 0)num++;
            }
        }
        if(num>0) return true;
        else {
            year = 0;
            return false;
        }
    }
}
