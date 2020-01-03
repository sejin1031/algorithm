import java.util.Arrays;
import java.util.Scanner;

public class Remain {
    public static void main(String... args) {
        Scanner scn =  new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0;i<10;i++) {
            nums[i] = scn.nextInt()%42;
        }
        System.out.println(Arrays.stream(nums).distinct().toArray().length);
    }
}
