import java.util.Scanner;

import static java.lang.System.*;

public class Back_11047 {
    public static void main(String... args){
        Scanner scn = new Scanner(in);
        int N = scn.nextInt();
        long K = scn.nextLong();
        long[] coins = new long[N+1];
        for(int i = 1;i<=N;i++) coins[i] = scn.nextLong();
        long cur = K;
        int count = 0;
        for(int i = N;i>0;i--){
            if(cur < coins[i]){
                continue;
            }
            if(cur % coins[i] == 0){
                count += cur / coins[i];
                break;
            }
            else if(cur >= coins[i]){
                count += cur/coins[i];
                cur -= coins[i] * (cur / coins[i]);
            }
        }
        out.println(count);


    }
}
