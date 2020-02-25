import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Back_15657 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N,M;
    static int[] nums;
    static int[] ans = new int[10];

    public static void main(String... args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        N = Integer.parseInt(s1[0]);
        M = Integer.parseInt(s1[1]);
        nums = new int[N];
        for(int i = 0;i<N;i++){
            nums[i] = Integer.parseInt(s2[i]);
        }
        Arrays.sort(nums);
        dfs(0,0);
        bw.flush();
    }
    static void dfs(int start, int idx) throws Exception{
        if(idx == M){
            for(int i = 0;i<M;i++){
                bw.write(Integer.toString(ans[i])+" ");
            }
            bw.newLine();
        }
        for(int i = start;i<N;i++){
            boolean[] visited = new boolean[10];
            if(visited[i]) continue;
            ans[idx] = nums[i];
            visited[i] = true;
            if(idx+1<=M) dfs(i,idx+1);
            visited[i] = false;
        }
    }
}
