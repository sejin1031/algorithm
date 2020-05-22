import java.util.Arrays;
import java.util.Scanner;

public class Back_2309 {
    public static void main(String... args){
        int[] nums = new int[9];
        int idx1= -1,idx2 = -1,sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<9;i++){
            sum += nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        sum -= 100;
        for(int i = 0;i<8;i++){
            for(int j = i+1;j<9;j++){
                if(nums[i]+nums[j] == sum){
                    idx1 = i;
                    idx2 = j;
                    break;
                }
            }
        }
        for(int i = 0;i<9;i++){
            if(i == idx1 || i == idx2) continue;
            System.out.println(nums[i]);
        }
    }

}
