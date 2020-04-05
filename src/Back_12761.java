import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Back_12761 {
    static int A, B, N, M;
    static boolean[] visited = new boolean[100001];
    static int stoi(String s){return Integer.parseInt(s);}

    static class Pos{
        int pos,num;
        public Pos(int pos,int num){
            this.pos = pos;
            this.num = num;
        }
    }

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = stoi(st.nextToken());
        B = stoi(st.nextToken());
        N = stoi(st.nextToken());
        M = stoi(st.nextToken());
        System.out.print(bfs());
    }
    static int bfs(){
        //[0] : pos, [1] : num
        Deque<Pos> l = new LinkedList<>();
        visited[N] = true;
        l.offer(new Pos(N,0));

        while(!l.isEmpty()){
            Pos cur = l.poll();
            if(cur.pos == M) {
                return cur.num;
            }
            if(cur.pos * A <= 100000 && !visited[cur.pos * A]) {
                visited[cur.pos * A] = true;
                l.offer(new Pos(cur.pos * A,cur.num+1));
            }
            if(cur.pos * B <= 100000 && !visited[cur.pos * B]) {
                visited[cur.pos * B] = true;
                l.offer(new Pos(cur.pos * B,cur.num+1));
            }
            if(cur.pos + A <= 100000 && !visited[cur.pos + A]) {
                visited[cur.pos + A] = true;
                l.offer(new Pos(cur.pos + A , cur.num+1));
            }
            if(cur.pos + B <= 100000 && !visited[cur.pos + B]) {
                visited[cur.pos + B] = true;
                l.offer(new Pos(cur.pos + B, cur.num+1));
            }
            if(cur.pos + 1 <= 100000 && !visited[cur.pos + 1]) {
                visited[cur.pos + 1] = true;
                l.offer(new Pos(cur.pos + 1, cur.num+ 1));
            }
            if(cur.pos - 1 >= 0 && !visited[cur.pos -1]) {
                visited[cur.pos - 1] = true;
                l.offer(new Pos(cur.pos - 1 , cur.num+1));
            }
            if(cur.pos - A >= 0 && !visited[cur.pos - A]) {
                visited[cur.pos - A] = true;
                l.offer(new Pos(cur.pos - A , cur.num+1));
            }
            if(cur.pos - B >= 0 && !visited[cur.pos - B]) {
                visited[cur.pos - B] = true;
                l.offer(new Pos(cur.pos - B , cur.num+1));
            }
        }
        return 0;
    }
}
