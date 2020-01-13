import java.util.Scanner;

public class Back_11403 {
    static int graph[][];
    static boolean visited[];
    static int start;

    public static void dfs(int i){
        visited[i] = true;
        for(int j = 0;j<visited.length;j++){
            if(graph[i][j] == 1 && j == start){
                graph[start][start] = 1;
            }
            else if(graph[i][j] == 1 && !visited[j]){
                graph[start][j] = 1;
                dfs(j);
            }
        }
    }
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        graph = new int[N][N];
        visited = new boolean[N];
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++) {
                graph[i][j] = scn.nextInt();
            }
        }

        for(int i = 0;i<N;i++){
            start = i;
            dfs(i);
            for(int j = 0;j<N;j++) visited[j] = false;
        }
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
}
