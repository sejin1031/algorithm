import java.util.Scanner;

public class Back_11724 {
    static int result = 0;
    static int N;
    static int M;
    static int[][] v;
    static boolean[] visited;
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        N = scn.nextInt();
        M = scn.nextInt();
        visited = new boolean[N+1];
        v = new int[N+1][N+1];
        for(int i = 0;i<M;i++){
            int a = scn.nextInt();
            int b = scn.nextInt();
            v[a][b] = v[b][a] = 1;
        }
        for(int i = 1;i<=N;i++){
            if(!visited[i]){
                result++;
                dfs(i);
            }
        }
        System.out.println(result);
    }
    public static void dfs(int n){
        visited[n] = true;
        for(int i = 1;i<=N;i++){
            if(v[n][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }
}
