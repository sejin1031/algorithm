import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.System.*;

public class Back_1931 {
    public static void main(String... args){
        Scanner scn = new Scanner(in);
            int N = scn.nextInt();
            Pair[] times = new Pair[N];
            for(int i = 0;i<N;i++){
                times[i] = new Pair(scn.nextInt(),scn.nextInt());
        }
        Arrays.sort(times,Pair.comparator);
        int count = 1;
        int end = times[0].e;

        for(int i = 1;i<N;i++){
            if(times[i].s >= end){
                end = times[i].e;
                count++;
            }
        }
        out.println(count);
    }

    static class Pair{
        int s, e;
        Pair(int s, int e){
            this.s = s;
            this.e = e;
        }
        static Comparator<Pair> comparator = (o1, o2) -> {
            if(o1.e>o2.e) return 1;
            else if(o1.e==o2.e){
                if(o1.s>o2.s) return 1;
                else return  -1;
        }
            else return -1;
        };
    }
}
