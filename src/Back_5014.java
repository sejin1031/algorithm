import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back_5014 {
    static int F,S,G,U,D;
    static int[] arr;
    public static void main(String... args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        F = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());
        arr = new int[F+1];
        bfs();
    }
    static void bfs(){
        Queue<Integer> q = new LinkedList<>();
        q.add(S);
        arr[S] = 1;
        while (!q.isEmpty()){
            int floor = q.poll();
            if(floor == G){
                System.out.print(arr[floor]-1);
                return;
            }
            if(floor + U <= F && arr[floor + U] == 0){
                arr[floor+U] = arr[floor] + 1;
                q.add(floor+U);
            }

            if(floor - D > 0 && arr[floor - D] == 0){
                arr[floor-D] = arr[floor] + 1;
                q.add(floor-D);
            }
        }
        System.out.print("use the stairs");
        return;
    }

}
