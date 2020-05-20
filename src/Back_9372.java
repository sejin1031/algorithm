import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_9372 {
    static int N,M,T,min;
    static int[][] map;
    static boolean[] visited;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String... args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for(int i = 0;i<T;i++){
            min = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            map = new int[N+1][N+1];
            visited = new boolean[N+1];
            for(int j = 0;j<M;j++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                map[a][b] = map[b][a] = 1;
            }
            bw.write(Integer.toString(bfs()-1));
            bw.newLine();
        }
        bw.flush();
    }
    static int bfs(){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        visited[1] = true;
        while (!q.isEmpty()){
            min++;
            int val = q.poll();
            for(int i = 1;i<=N;i++){
                if(map[val][i] != 0 && !visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }

        return min;
    }
}
