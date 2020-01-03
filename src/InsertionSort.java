import java.util.Scanner;

public class InsertionSort {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
        int[] nums = new int[test];
        for(int i = 0;i<test;i++) nums[i]=scn.nextInt();
        for(int i = 0;i<nums.length;i++) {
            for(int j = i+1;j<nums.length;j++) {
                if(nums[i] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        for(int i:nums) System.out.println(i);
        scn.close();
    }
}
