import java.util.Scanner;

public class Back_13301 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] len = new long[N];
        len[0] = 1;
        if(N > 1) len[1] = 1;
        for(int i = 2;i<N;i++) {
            len[i] = len[i-1] + len[i-2];
        }
        System.out.print(N > 1 ? len[N-1] * 4 + len[N-2] * 2 : 4);
    }
}
