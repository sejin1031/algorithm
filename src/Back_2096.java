import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_2096 {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] cur = new int[3][2];
        int[] next = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        cur[0][0] = cur[0][1] = Integer.parseInt(st.nextToken());
        cur[1][0] = cur[1][1] = Integer.parseInt(st.nextToken());
        cur[2][0] = cur[2][1] = Integer.parseInt(st.nextToken());
        for(int i = 1;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<3;j++) next[j] = Integer.parseInt(st.nextToken());
            cur[0][0] = next[0] + Math.min(cur[0][0],cur[1][0]);
            cur[0][1] = next[0] + Math.max(cur[0][1],cur[1][1]);
            cur[1][0] = next[1] + Math.min(cur[0][0],Math.min(cur[1][0],cur[2][0]));
            cur[1][1] = next[1] + Math.max(cur[0][1],Math.max(cur[1][1],cur[2][1]));
            cur[2][0] = next[2] + Math.min(cur[1][0],cur[2][0]);
            cur[2][1] = next[2] + Math.max(cur[1][1],cur[2][1]);
        }
        System.out.print(Math.max(cur[0][1],Math.max(cur[1][1],cur[2][1]))+" "+
                Math.min(cur[0][0],Math.min(cur[1][0],cur[2][0])));
    }
}
