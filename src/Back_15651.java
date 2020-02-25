import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Back_15651 {
    static int[] nums = new int[10];
    static int N,M;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String... args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        dfs(0);
        bw.flush();
    }
    static void dfs(int idx) throws Exception{
        if(idx == M){
            for(int i = 0;i<M;i++){
                bw.write(Integer.toString(nums[i])+" ");
            }
            bw.newLine();
            return;
        }
        for(int i = 1;i<=N;i++){
            boolean[] vis = new boolean[10];
            if(vis[i]) continue;
            vis[i] = true;
            nums[idx] = i;
            dfs(idx+1);
        }
    }
}
