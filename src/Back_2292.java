import java.util.Scanner;

public class Back_2292 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        double N = scn.nextDouble();
        int k = 1;
        double sum = 1;
        while(sum < N){
            sum += 6 * ++k;
        }
        System.out.println(k);
    }
}
