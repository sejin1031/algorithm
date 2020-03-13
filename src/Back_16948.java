import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_16948 {
    static int N;
    static int ans = -1;
    static int[][] map;

    static int[] start;
    static int[] end;

    static int[] x = {-2,-2,0,0,2,2};
    static int[] y = {-1,1,-2,2,-1,1};
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        start = new int[2];
        end = new int[2];
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                map[i][j] = -1;
            }
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<2;i++) start[i] = Integer.parseInt(st.nextToken());
        for (int i = 0; i<2;i++) end[i] = Integer.parseInt(st.nextToken());
        map[start[0]][start[1]] = 0;
        bfs();
    }

    static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        q.offer(start);
        while (!q.isEmpty()){
            int[] cur = q.poll();

            for(int dir = 0; dir < x.length; dir++){
                int xx = cur[0] + x[dir];
                int yy = cur[1] + y[dir];
                if(xx<0 || yy < 0 || xx >= N || yy >= N) continue;

                if(map[xx][yy] == -1){
                    map[xx][yy] = map[cur[0]][cur[1]] + 1;
                    int[] next = {xx,yy};
                    q.offer(next);
                }
            }
        }
            System.out.print(map[end[0]][end[1]]);

    }
}
