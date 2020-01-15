import java.util.Scanner;

public class Back_17173 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        boolean[] visited = new boolean[1001];
        long sum = 0;
        int[] nums = new int[M];
        for(int i = 0;i<M;i++) nums[i] = scn.nextInt();
        for(int i = 0;i<M;i++){
            for(int j = 1;nums[i]*j<=N;j++){
                if(!visited[nums[i]*j]){
                    sum += nums[i]*j;
                    visited[nums[i]*j] = true;
                }
            }
        }
        System.out.print(sum);
    }
}
