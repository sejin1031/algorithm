import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Back_5618 {
    public static void main(String... args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        int min = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
            nums[i] = Integer.parseInt(st.nextToken());
            min = Math.min(min,nums[i]);
        }
        for(int i = 1;i<=min;i++){
            boolean flag = true;
            for(int j = 0;j<n;j++){
                if(nums[j] % i != 0){
                    flag = false;
                    break;
                }
            }
            if(flag) {
                bw.write(Integer.toString(i));
                bw.newLine();
            }
        }
        bw.flush();
    }
}
