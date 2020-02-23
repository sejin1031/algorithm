import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Back_1697 {
    static int A;
    static int B;
    static int result = 0;
    static boolean[] visited = new boolean[100001];
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        A = scn.nextInt();
        B = scn.nextInt();
        bfs(A,B);
        if(A==B) result = 0;
        System.out.print(result);
    }
    public static void bfs(int A, int B){
        Queue<Integer> curQ = new LinkedList<>();
        curQ.offer(A);
        Queue<Integer> nextQ = new LinkedList<>();
        while(!curQ.isEmpty()){
            result++;
            nextQ = new LinkedList<>();
            while (!curQ.isEmpty()){
                int cur = curQ.poll();
                visited[cur] = true;
                int[] next = {cur-1,cur+1,cur*2};
                for(int i = 0;i<3;i++){
                    if(next[i] == B){
                        curQ.clear();
                        nextQ.clear();
                        break;
                    }
                    else if(next[i] >=0 && next[i] <= 100000
                            && !visited[next[i]]){
                        nextQ.offer(next[i]);
                    }
                }
            }
            curQ = nextQ;
        }
    }
}
