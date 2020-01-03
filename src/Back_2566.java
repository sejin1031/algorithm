import java.util.Scanner;

public class Back_2566 {
    public static void main(String... args) {
       Scanner scn = new Scanner(System.in);
       int[][] nums = new int[10][10];
       for(int i = 1;i<=9;i++)
           for(int j = 1;j<=9;j++) nums[i][j] = scn.nextInt();
       int max = 0; int row = 1;int col = 1;
       for(int i = 1;i<=9;i++) {
           for(int j = 1;j<=9;j++) {
               if(nums[i][j]>max) {
                   max = nums[i][j];
                   row = i; col=j;
               }
           }
       }
       System.out.println(max);
       System.out.print(row+" "+col);
       scn.close();
    }
}
