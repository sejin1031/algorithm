import java.util.Scanner;

public class Saengsungja {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int sang = 0;
        for(int i = 1;i<N;i++) {
            int sum = i;
            String[] num = Integer.toString(i).split("");
            for(int j = 0;j<num.length;j++) {
                sum += Integer.parseInt(num[j]);
            }
            if(sum == N) {
                sang = i;
                break;
            }
        }
        System.out.println(sang);
        scn.close();
    }
}
