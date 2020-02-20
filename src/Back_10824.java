import java.util.Scanner;

public class Back_10824 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        String[] nums = new String[4];
        for(int i = 0; i<4;i++) nums[i] = Integer.toString(scn.nextInt());
        System.out.print(Long.parseLong(nums[0]+nums[1]) +
                Long.parseLong(nums[2]+nums[3]));
    }
}
