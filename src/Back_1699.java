import java.util.Scanner;

public class Back_1699 {
    public static void main(String... args){
        int N = (new Scanner(System.in)).nextInt();
        int count = 0;
        if( N % 2 == 0 && (int) Math.pow(Math.sqrt(N/2),2) == N/2){
            count = 2;
        }
        else{
            while(N>0){
                N -= (int) (Math.pow((int) Math.sqrt(N),2));
                count++;
            }
        }
        System.out.println(count);
    }
}