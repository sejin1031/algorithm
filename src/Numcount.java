import java.util.Scanner;

public class Numcount {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int result = a * b * c;
        int[] count = new int[10];
        String result2 = String.valueOf(result);
        String[] result3 = result2.split("");
        for(int i = 0;i<result3.length;i++) {
            count[Integer.parseInt(result3[i])]++;
        }
        for(int i:count) {
            System.out.println(i);
        }
    }
}
