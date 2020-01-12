import java.util.Scanner;

public class Back_2875 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        int K = scn.nextInt();
        int result = 0;
        while(N>=2 && M >=1  && N+M >= 3 + K){
            N-=2;M--;
            result++;
        }
        System.out.println(result);
    }
}
