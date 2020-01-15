import java.util.Scanner;

public class Back_5585 {
    public static void main(String... args){
        int payBack = 1000 - (new Scanner(System.in)).nextInt();
        int[] coins = {500,100,50,10,5,1};
        int num = 0;
        for(int i = 0;i<coins.length;i++){
            num += payBack / coins[i];
            payBack -= (payBack / coins[i]) * coins[i];
        }
        System.out.print(num);
    }
}
