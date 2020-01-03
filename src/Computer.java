import java.util.Scanner;

public class Computer{
    public static int process(int a, int b) {
        int[] computer = new int[11];
        for(int i = 0;i<=10;i++) computer[i] = i;
        computer[0] = 10;
        
        int result = 1;
        for(int i = 1; i<=b;i++) {
            result *= a;
            result %= 10;
        }
        return computer[result];
    }
    
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int testCase = scn.nextInt();
        int[] output = new int[testCase];
        for(int i = 0;i<testCase;i++){
            int a = scn.nextInt();
            int b = scn.nextInt();
            output[i] = process(a,b);
        }
        for(int i : output) {
            System.out.println(i);
        }
        scn.close();
    }
    
}
