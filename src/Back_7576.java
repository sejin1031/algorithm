import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Back_7576 {
    static int N,M;
    static int[][] toma;
    static boolean[][] visited;
    static int[] x = {1,-1,0,0};
    static int[] y = {0,0,1,-1};
    static int result = 0;
    static int zero_count = 0;

    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        M = scn.nextInt();
        N = scn.nextInt();
        toma = new int[N][M];
        visited = new boolean[N][M];
        result = 0;
        Queue<Pos> q = new LinkedList<>();
        for(int i = 0;i<N;i++){
            for(int j = 0; j<M;j++){
                toma[i][j] = scn.nextInt();
                if(toma[i][j] == 1) q.offer(new Pos(i,j));
                else if(toma[i][j] == 0) zero_count++;
            }
        }
        bfs(q);
        System.out.println(result);
    }
    public static void bfs(Queue<Pos> q){
        Queue<Pos> curQ = q;
        Queue<Pos> nextQ;
        while(!curQ.isEmpty()){
            result++;
            nextQ = new LinkedList<>();
            while (!curQ.isEmpty()) {
                Pos pos = curQ.poll();
                visited[pos.x][pos.y] = true;
                for(int dir = 0;dir<4;dir++){
                    int xx = pos.x + x[dir];
                    int yy = pos.y + y[dir];
                    if(xx >= 0 && yy >= 0 && xx < N && yy < M
                    && !visited[xx][yy] && toma[xx][yy] == 0){
                        visited[xx][yy] = true;
                        nextQ.offer(new Pos(xx,yy));
                        zero_count--;
                    }
                }
            }
            curQ = (Queue<Pos>) ((LinkedList<Pos>) nextQ).clone();
        }
        if(zero_count > 0) result = -1;
        else result--;
    }
}

class Pos{
    int x;
    int y;
    public Pos(int x, int y){
        this.x = x;
        this.y = y;
    }
}
