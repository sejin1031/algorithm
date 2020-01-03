import java.util.Scanner;

public class Back_9461 {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
        int[] nums = new int[test];
        long[] result = new long[test];
        for(int i = 0;i<test;i++) nums[i] = scn.nextInt();
        for(int i = 0;i<test;i++) {
            long[] pado = new long[101];
            pado[1] = 1; pado[2] = 1; pado[3] = 1; pado[4] = 2; pado[5] = 2;
            pado[6] = 3; pado[7] = 4; pado[8] = 5; pado[9] = 7; pado[10] = 9;
            if(nums[i]>10) {
                for(int j = 11;j<=nums[i];j++) {
                    pado[j] = pado[j-1]+pado[j-5];
                }
            }
            result[i] = pado[nums[i]];
        }
        for(long i :result) System.out.println(i);
        scn.close();
    }
}
