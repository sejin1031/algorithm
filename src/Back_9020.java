import java.util.Scanner;

public class Back_9020 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        int[] nums = new int[T];
        for(int i = 0;i<T;i++) nums[i] = scn.nextInt();
        for(int i = 0;i<T;i++){
            int a = nums[i] / 2;
            int b = nums[i] / 2;
            while(a >= 1){
                if(isPrime(a) && isPrime(b)){
                    break;
                }
                else{
                    a--; b++;
                }
            }
            System.out.println(a+" "+b);
        }
    }
    public static boolean isPrime(int n){
        boolean flag = true;
        for(int i = 2;i<n;i++){
            if(n % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
