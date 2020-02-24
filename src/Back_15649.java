import java.util.Scanner;

public class Back_15649 {
    static boolean[] visited = new boolean[10];
    static int[] nums = new int[10];
    static int N,M;
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        N = scn.nextInt();
        M = scn.nextInt();
        dfs(0);

    }
    static void dfs(int idx){
        if(idx == M){
            for(int i = 0;i<M;i++){
                System.out.print(nums[i]);
                if(i != M-1)
                    System.out.print(' ');
            }
            System.out.println();
            return;
        }
        for(int i = 1;i<=N;i++){
            if(visited[i]) continue;
            visited[i] = true;
            nums[idx] = i;
            dfs(idx+1);
            visited[i] = false;
        }
    }
}
