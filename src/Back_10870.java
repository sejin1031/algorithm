import java.util.Scanner;

public class Back_10870 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        for(int i = 0; i<n; i++) {
            int tmp = num2;
            num2 += num1;
            num1 = tmp;
        }
        System.out.print(num1);
    }
}
