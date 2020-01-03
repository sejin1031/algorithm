import java.util.Scanner;

public class Back_1149 {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int house = scn.nextInt();
        int[][] col = new int[house+1][3];
        for(int i = 1;i<=house;i++) {
            for(int j = 0; j<3;j++) {
                col[i][j] = scn.nextInt();
            }
        }
        for(int i = 2;i<=house;i++) {
            col[i][0] += Math.min(col[i-1][1],col[i-1][2]);
            col[i][1] += Math.min(col[i-1][2],col[i-1][0]);
            col[i][2] += Math.min(col[i-1][1],col[i-1][0]);
        }
        System.out.println(Math.min(Math.min(col[house][0],col[house][1]), col[house][2]));
        
    }
}
