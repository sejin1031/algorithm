import java.util.Arrays;
import java.util.Scanner;

public class SmallNum {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int X = scn.nextInt();
        int[] nums = new int[N];
        for(int i = 0;i<N;i++) {
            nums[i] = scn.nextInt();
        }
        int[] nums2 = Arrays.stream(nums).filter(n->(n<X)).toArray();
        for(int i:nums2) {
            System.out.print(i+" ");
        }
    }
}
