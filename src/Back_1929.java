import java.util.Scanner;

public class Back_1929 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int M = scn.nextInt();
        int N = scn.nextInt();
        for(int i = M;i<=N;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int number) {
        if (number == 2)
            return true;
        if (number == 1)
            return false;
        if (number % 2 == 0)
            return false;
        for (int n = 3; n <= Math.sqrt(number); n+=2) {
            if (number % n == 0){
                return false;
            }
        }
        return true;
    }

}
