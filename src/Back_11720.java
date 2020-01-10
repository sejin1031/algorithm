import java.util.Scanner;

public class Back_11720 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        String[] nums = new String[N];
        String strNum = scn.next();
        nums = strNum.split("");
        int sum = 0;
        for(int i = 0;i<N;i++) sum += Integer.parseInt(nums[i]);
        System.out.println(sum);
    }
}
