import java.util.Scanner;

public class Notebook {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int profit = 0;
        int spend = a;
        int count = 0;
        boolean flag = true;
        if(c-b<=0) {
            flag = false;
            count=-1;
        }
        while(flag) {
            if(profit > spend) {
                break;
            }
            spend += b;
            profit += c;
            count++;

        }
        System.out.println(count);
    }
}
