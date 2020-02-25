import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Back_15652 {
    static int[] nums = new int[10];
    static int N,M;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String... args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        dfs(1,0);
        bw.flush();
    }
    public static void dfs(int start, int idx) throws Exception{
        if(idx == M){
            for(int i = 0;i<M;i++){
                bw.write(Integer.toString(nums[i])+" ");
            }
            bw.newLine();
        }
        for(int i = start;i<=N;i++){
            boolean visited[] = new boolean[10];
            if(visited[i]) continue;
            visited[i] = true;
            nums[idx] = i;
            if(idx+1<=M)dfs(i,idx+1);
            visited[i] =false;

        }
    }
}
