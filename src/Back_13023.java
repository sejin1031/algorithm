import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back_13023 {
    static int N,M, ans=0;
    static ArrayList<Integer>[] graph;
    static boolean visited[] = new boolean[2001];

    public static void main(String... args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N];
        M = Integer.parseInt(st.nextToken());
        for(int i = 0;i<N;i++){
            graph[i] = new ArrayList<Integer>();
        }
        for(int i = 0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
        for(int i = 0;i<N;i++){
            Arrays.fill(visited,false);
            visited[i] = true;
            dfs(i,0);
            if(ans == 1){
                System.out.print(1);
                return;
            }
        }
        System.out.print(0);
    }
    static void dfs(int idx,int depth){
        if(depth == 4){
            ans = 1;
            System.out.print(1);
            System.exit(0);
        }
        else{
            visited[idx] = true;
            for(int i = 0;i<graph[idx].size();i++){
                int next = graph[idx].get(i);
                if(!visited[next]){
                    dfs(next,depth+1);
                }

            }
            visited[idx] = false;
        }
    }
}
