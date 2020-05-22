import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Back_1261 {
    static int N,M, map[][];
    static int[] x = {1,-1,0,0};
    static int[] y = {0,0,1,-1};
    static int[][] cum;
    public static void main(String... args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        cum = new int[M+1][N+1];
        map = new int[M+1][N+1];
        for(int i = 1;i<=M;i++){
            String[] str = br.readLine().split("");
            for(int j = 1;j<=N;j++){
                map[i][j] = Integer.parseInt(str[j-1]);
                cum[i][j] = Integer.MAX_VALUE;
            }
        }
        cum[1][1] = 0;
        bfs();
        System.out.print(cum[M][N]);

    }
    static void bfs(){
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(1,1));
        while (!q.isEmpty()){
            Pair cur = q.poll();
            for(int dir = 0;dir<4;dir++){
                int dx = cur.x + x[dir];
                int dy = cur.y + y[dir];
                if(dx <= 0 || dy <= 0 || dx > M || dy > N) continue;

                if(cum[dx][dy] > cum[cur.x][cur.y]+map[dx][dy]){
                    cum[dx][dy] = cum[cur.x][cur.y]+map[dx][dy];
                    q.offer(new Pair(dx,dy));
                }
            }
        }
    }

    static class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
