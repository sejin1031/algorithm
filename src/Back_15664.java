import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Back_15664 {
    static int N,M;
    static int[] nums;
    static int[] ans = new int[10];
    static boolean[] visited = new boolean[10];

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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
//        Arrays.stream(nums).forEach(x->System.out.print(x + " "));
        dfs(0,0);
        bw.flush();
    }
    static void dfs(int start,int idx) throws Exception{
        if(idx == M){
            for(int i = 0;i<M;i++){
                bw.write(Integer.toString(ans[i])+" ");
            }
            bw.newLine();
        }
        boolean[] visited_num = new boolean[10001];
        for(int i = start;i<N;i++){
            if(visited_num[nums[i]] || visited[i]) continue;
            visited[i] = true;
            visited_num[nums[i]] = true;
            ans[idx] = nums[i];
            if(idx+1<=M) dfs(i+1,idx+1);
            visited[i] = false;
        }
    }
}
