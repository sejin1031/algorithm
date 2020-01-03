import java.util.Arrays;
import java.util.Scanner;
public class Second {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i = 0;i<3;i++)
            nums[i] = scn.nextInt();
        Arrays.sort(nums);
        System.out.println(nums[1]);
        scn.close();
    }
}
