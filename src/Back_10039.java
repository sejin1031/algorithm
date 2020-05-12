import java.util.Scanner;

public class Back_10039 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input;
        for(int i = 0;i<5;i++){
            input = sc.nextInt();
            sum += input < 40 ? 40 : input;
        }
        System.out.print(sum/5);
    }
}
