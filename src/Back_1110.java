import java.util.Scanner;

public class Back_1110 {
    public static void main(String... args){
        int N = (new Scanner(System.in)).nextInt();
        int cycle = 0;
        int newnum = N;
        while(true){
            cycle++;
            newnum = 10 * (newnum % 10) + (newnum/10+newnum%10)%10;
            if(newnum == N){
                break;
            }
        }
        System.out.print(cycle);
    }
}
