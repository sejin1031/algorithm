import java.util.Scanner;

public class Back_15650 {
    static boolean[] visited = new boolean[10];
    static int N,M;
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        N = scn.nextInt();
        M = scn.nextInt();
        dfs(0,0);

    }
    static void dfs(int start, int depth){
        if(depth == M){
            print(visited);
        }
        for(int i = start;i<N;i++){
            visited[i] = true;
            dfs(i+1,depth+1);
            visited[i] = false;
        }
    }
    public static void print(boolean[] visited){
        for(int i = 0;i<=N;i++){
            if(visited[i])
                System.out.print((i+1) + " ");
        }
        System.out.println();
    }
}
