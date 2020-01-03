import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
        int[] nums = new int[test];
        for(int i = 0;i<test;i++) nums[i]=scn.nextInt();
        
        for(int i:nums) System.out.println(i);
        scn.close();
    }
}
