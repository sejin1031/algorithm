import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Back_5543 {
    public static void main(String... args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] burger = new int[3];
        int[] bav = new int[2];
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i<3;i++) burger[i] = Integer.parseInt(br.readLine());
        for(int i = 0;i<2;i++) bav[i] = Integer.parseInt(br.readLine());
        for(int i = 0;i<3;i++){
            for(int j = 0;j<2;j++){
                ans = Math.min(ans,burger[i]+bav[j]-50);
            }
        }
        System.out.print(ans);
    }
}
