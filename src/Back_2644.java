import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_2644 {
    static int[][] graph;
    static boolean[][] visited;
    static int n,m,a,b;
    static int ans = -1;
    static class Chon{
        int x,chon;
        public Chon(int x, int chon){
            this.x = x;
            this.chon = chon;
        }
    }

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());
        graph = new int[n+1][n+1];
        visited = new boolean[n+1][n+1];

        for(int i = 1; i<=m;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = 1;
        }
        bfs();
        System.out.print(ans);

    }
    static void bfs(){
        Queue<Chon> q = new LinkedList<>();
        q.offer(new Chon(a,0));
        while (!q.isEmpty()){
            Chon ch = q.poll();
            for(int i = 1;i<=n;i++){
                if(graph[ch.x][i] == 0 || visited[ch.x][i]) continue;
                if(i == b){
                    ans = ch.chon+1;
                    return;
                } else{
                    visited[ch.x][i] = true;
                    q.offer(new Chon(i,ch.chon+1));
                }
            }
        }
    }
}
