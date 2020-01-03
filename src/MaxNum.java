import java.util.Arrays;
import java.util.Scanner;

public class MaxNum {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int[] nums = new int[9];
        for(int i = 0;i<9;i++)
            nums[i] = scn.nextInt();
        int[] nums2 = nums.clone();
        Arrays.sort(nums2);
        int max = nums2[8];
        int index = 0;
        for(int i = 0;i<9;i++) {
            if(nums[i]==max) {
                index = i;
                break;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
