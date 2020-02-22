import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Back_2178 {
    static int N,M;
    static int[][] maze;
    static boolean[][] visited;
    static int[] dr = {1,-1,0,0};
    static int[] dc = {0,0,1,-1};

    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        N = scn.nextInt();
        M = scn.nextInt();
        maze = new int[N][M];
        visited = new boolean[N][M];
        for(int i = 0;i<N;i++){
            String str = scn.next();
            for(int j = 0;j<M;j++){
                maze[i][j] = str.charAt(j)-'0';
            }
        }
        bfs(0,0);

        System.out.println(maze[N-1][M-1]);

    }
    public static void bfs(int i, int j){
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(i,j));

        while (!q.isEmpty()){
            Pair location = q.poll();
            visited[i][j] = true;

            for(int dir = 0;dir<4;dir++){
                int r = location.x + dr[dir];
                int c = location.y + dc[dir];

                if(r >= 0 && c >= 0 && r < N && c < M){
                    if(maze[r][c] != 0 && !visited[r][c]){
                        q.offer(new Pair(r,c));
                        visited[r][c] = true;
                        maze[r][c] = maze[location.x][location.y] + 1;
                    }
                }
            }
        }
    }
}

class Pair{
    int x;
    int y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
