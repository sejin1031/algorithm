import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Back_2668 {
    static int N;
    static int[] nums;
    static boolean[] visited;
    static int[] ans;
    static int start;
    static ArrayList<Integer> al;

    public static void main(String... args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        nums = new int[N+1];
        visited = new boolean[N+1];
        ans = new int[N];
        al = new ArrayList<>();

        for(int i = 1;i<=N;i++) nums[i] = Integer.parseInt(br.readLine());
        for(int i = 1;i<=N;i++){
            visited[i] = true;
            start = i;
            dfs(i);
            visited[i] = false;
        }
        Collections.sort(al);
        bw.write(Integer.toString(al.size()));
        bw.newLine();
        for (int i : al) {
            bw.write(Integer.toString(i));
            bw.newLine();
        }

        bw.flush();
    }

    static void dfs(int i) {
        if(!visited[nums[i]]){
            visited[nums[i]] = true;
            dfs(nums[i]);
            visited[nums[i]] = false;
        }
        if(start == nums[i]){
            al.add(start);
        }
    }
}
