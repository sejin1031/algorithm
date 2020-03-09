import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back_3047 {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[3];
        for(int i = 0;i<3;i++)nums[i] = Integer.parseInt(st.nextToken());
        String ABC = br.readLine();
        Arrays.sort(nums);
        for(int i = 0;i<3;i++){
            System.out.print(nums[ABC.charAt(i)-65]+" ");
        }

    }
}
