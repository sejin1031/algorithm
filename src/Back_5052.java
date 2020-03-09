import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Back_5052 {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        boolean[] ans = new boolean[T];
        Arrays.fill(ans,true);
        for(int i = 0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            String[] nums = new String[N];
            for(int j = 0;j<N;j++) nums[j] = br.readLine();
            Arrays.sort(nums);
            for(int j = 1;j<N;j++){
                if(nums[j].startsWith(nums[j-1])){
                    ans[i] = false;
                    break;
                }
            }
        }
        for(int i = 0;i<T;i++) System.out.println(ans[i]?"YES":"NO");

    }
}
