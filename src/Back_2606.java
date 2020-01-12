import java.util.Scanner;

public class Back_2606 {
    static int[][] graph;
    static boolean visited[];
    static int V;
    static int E;
    static int num = 0;
    public static void dfs(int i){
        visited[i] = true;
        for(int j = 1;j<=V;j++){
            if(graph[i][j] == 1 && visited[j] == false){
                num++;
                dfs(j);
            }
        }
    }
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        graph = new int[101][101];

        V = scn.nextInt();
        E = scn.nextInt();
        visited = new boolean[V+1];
        for(int i = 0;i<E;i++){
            int a = scn.nextInt();
            int b = scn.nextInt();
            graph[a][b] = graph[b][a] = 1;
        }
        dfs(1);
        System.out.println(num);
    }
}
