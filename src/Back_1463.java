import java.util.Scanner;

public class Back_1463 {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int X = scn.nextInt();
        int[] result = new int[1000001];
        result[1] = 0;
        result[2] = 1;
        for(int i = 3;i<=X;i++) {
            if(i % 3 == 0) {
                if(i % 2==0)
                    result[i] += Math.min(Math.min(result[i/3]+1, result[i/2]+1), result[i-1]+1);
                else
                    result[i] = Math.min(result[i/3]+1, result[i-1]+1);
            }
            else if(i % 2 == 0) {
                result[i] += Math.min(result[i/2]+1, result[i-1]+1);
            }
            else
                result[i] += result[i-1]+1;
        }
        
        System.out.println(result[X]);
        scn.close();
    }
}
