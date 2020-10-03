import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_3055 {
    static int R,C, time;
    static String[][] map;
    static boolean[][] visit;
    static int initR,initC;
    static int X,Y;

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        time = 0;
        map = new String[R][C];
        visit = new boolean[R][C];
        for(int i = 0;i<R;i++){
            map[i] = br.readLine().split("");
            for(int j = 0;j<C;j++){
                if(map[i][j].equals("S")){
                    initR = i;
                    initC = j;
                } else if(map[i][j].equals("D")){
                    X = i;
                    Y = j;
                }
            }
        }
        bfs();
    }

    static void setVisit(){
        for(int i = 0;i<R;i++){
            for(int j = 0;j<C;j++){
                visit[i][j] = false;
            }
        }
    }

    static void flood(){
        setVisit();
        for(int i = 0;i<R;i++){
            for(int j = 0;j<C;j++){
                if(map[i][j].equals("*") && !visit[i][j]){
                    if( j-1 >= 0 && map[i][j-1].equals(".")){
                        map[i][j-1] = "*";
                        visit[i][j-1] = true;
                    }
                    if( j+1 < C && map[i][j+1].equals(".")){
                        map[i][j+1] = "*";
                        visit[i][j+1] = true;
                    }
                    if( i-1 >= 0 && map[i-1][j].equals(".")){
                        map[i-1][j] = "*";
                        visit[i-1][j] = true;
                    }
                    if( i+1 < R && map[i+1][j].equals(".")){
                        map[i+1][j] = "*";
                        visit[i+1][j] = true;
                    }
                }
                visit[i][j] = true;
            }
        }
        time++;
    }

    static void bfs(){
        Queue<Pos> q = new LinkedList();
        q.offer(new Pos(initR,initC,0));
        while(!q.isEmpty()){
            Pos pos = q.poll();
            for(int dir = 0;dir<4;dir++){
                int xx = pos.r + dx[dir];
                int yy = pos.c + dy[dir];
                if(xx < 0 || yy < 0 || xx >= R || yy >= C) continue;
                if(pos.time <= time) flood();
                if(xx == X && yy == Y){
                    System.out.print(pos.time);
                    return;
                } else if(map[xx][yy].equals(".")){
                    System.out.println("근처로이동성공");
                    q.offer(new Pos(xx,yy,pos.time+1));
                }
            }

        }
        System.out.print("KAKTUS");
    }

    static class Pos{
        int r,c,time;
        public Pos(int r,int c,int time){
            this.r=r;this.c=c;this.time=time;
        }
    }
}
