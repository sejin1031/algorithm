import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back_14888 {
    static int stoi(String s){return Integer.parseInt(s);}

    static int N;
    static int[] nums;

    static int[] result;

    //+ - * /
    static int[] op = new int[4];
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;


    public static void main(String...args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = stoi(br.readLine());
        nums = new int[N];
        result = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<N;i++){
            nums[i] = stoi(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<4;i++){
            op[i] = stoi(st.nextToken());
        }
        result[0] = nums[0];
        dfs(0);
        System.out.println(max + "\n"+ min);
    }


    static void dfs(int idx){
        if(idx == N-1){
            max = Math.max(max,result[N-1]);
            min = Math.min(min,result[N-1]);
        }

        boolean[] visited = new boolean[4];
        for(int i = 0;i<4;i++){
            if(visited[i] || op[i] == 0) continue;

            visited[i] = true;
            op[i]--;
            if (i == 0) {
                result[idx + 1] = result[idx] + nums[idx + 1];
            } else if (i == 1) {
                result[idx + 1] = result[idx] - nums[idx + 1];
            } else if (i == 2) {
                result[idx + 1] = result[idx] * nums[idx + 1];
            } else {
                result[idx + 1] = result[idx] / nums[idx + 1];
            }
            dfs(idx+1);
            visited[i] = false;
            op[i]++;
        }
    }
/*
    static void print(){
        Arrays.stream(result).forEach(x->System.out.print(x+" "));
        System.out.println();
    }
*/
}
