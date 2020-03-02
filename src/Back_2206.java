import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_2206 {
    static class Place{
        int x,y,dis,drill;
        public Place(int x, int y, int dis, int drill){
            this.x = x; this.y = y;this.dis = dis;this.drill = drill;
        }
    }
    static int N,M;
    static int[][] map;
    static int[][] visited;

    static int[] x = {1,-1,0,0};
    static int[] y = {0,0,1,-1};

    static int ans;

    static int stoi(String s){return Integer.parseInt(s);}


    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = stoi(st.nextToken());
        M = stoi(st.nextToken());

        map = new int[N][M];
        visited = new int[N][M];
        ans = Integer.MAX_VALUE;
        for(int i = 0;i<N;i++){
            String[] str = br.readLine().split("");
            for(int j = 0;j<M;j++){
                map[i][j] = stoi(str[j]);
                visited[i][j] = Integer.MAX_VALUE;
            }
        }
        bfs();
        System.out.print(ans!=Integer.MAX_VALUE?ans:-1);

    }
    static void bfs(){
        Queue<Place> q = new LinkedList<>();
        q.offer(new Place(0,0,1,0));
        visited[0][0] = 0;

        while (!q.isEmpty()){
            Place p = q.poll();
            if(p.x == N-1 && p.y == M-1){
                ans = p.dis;
                break;
            }
            for(int dir = 0;dir<4;dir++){
                int xx = p.x + x[dir];
                int yy = p.y + y[dir];

                if(xx<0 || yy <0 || xx >=N || yy >= M) continue;

                if(visited[xx][yy] <= p.drill)continue;

                if(map[xx][yy] == 0){
                    visited[xx][yy] = p.drill;
                    q.add(new Place(xx,yy,p.dis+1,p.drill));
                } else{
                    if(p.drill == 0){
                        visited[xx][yy] = p.drill+1;
                        q.add(new Place(xx,yy,p.dis+1,p.drill+1));
                    }
                }
            }
        }
    }
}
