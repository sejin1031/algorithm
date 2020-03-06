import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Back_13549 {
    static class Pair{
        int X,sec;
        public Pair(int X, int sec){
            this.X = X;
            this.sec = sec;
        }
    }
    static boolean[] visited = new boolean[100001];
    static int N,K;

    static int ans;

    public static void main(String... args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        bfs();
        System.out.print(ans);
    }
    static void bfs(){
        Deque<Pair> q = new LinkedList<>();
        q.offer(new Pair(N,0));
        while (!q.isEmpty()){
            Pair pair = q.poll();
            visited[pair.X] = true;
//            System.out.println("X : "+pair.X+"sec : "+pair.sec);
            if(pair.X == K){
                ans = pair.sec;
                return;
            }

            if(pair.X * 2 <=100000 && !visited[pair.X * 2])
                q.addFirst(new Pair(pair.X * 2,pair.sec));
            if(pair.X + 1 <= 100000 && !visited[pair.X + 1])
                q.offer(new Pair(pair.X+1,pair.sec+1));
            if(pair.X -1 >= 0 && !visited[pair.X -1])
                q.offer(new Pair(pair.X-1,pair.sec+1));
        }
    }
}
