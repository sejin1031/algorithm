import java.util.Scanner;

public class Tile {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        long[] nums = new long[1000001];
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 3;
        if(N>3) {
            for(int i = 4;i<=N;i++) {
                nums[i] = (nums[i-2]+nums[i-1])%15746;
            }
        }
        System.out.println(nums[N]%15746);
        scn.close();
        
        
    }
}
