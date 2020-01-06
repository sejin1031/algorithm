import java.util.Scanner;

import static java.lang.System.*;

public class Back_1931 {
    public static void main(String... args){
        Scanner scn = new Scanner(in);
        int N = scn.nextInt();
        int[][] times = new int[N][2];
        int count = 0;
        int max = 0;
        for(int i = 0;i<N;i++){
            times[i][0] = scn.nextInt();
            times[i][1] = scn.nextInt();
            if(times[i][1]>max) max = times[i][1];
        }
        sort(times);
        Boolean[] sch = new Boolean[max+1];
        for(int i = 0;i<sch.length;i++) sch[i]= false;
        for(int i = 0;i<N;i++){
            count++;
            for(int j = times[i][0]; j<=times[i][1]; j++){
                if(sch[j]){
                    for(int k = j-1;k>=times[i][0];k--){
                        sch[k] = false;
                    }
                    count--;
                    break;
                }
                else
                    sch[j] = true;
            }
        }
        out.println(count);



    }
    public static void sort(int[][] times){
        for(int i = 0;i<times.length;i++){
            for(int j = i+1;j<times.length;j++){
                    if(times[i][0]> times[j][0]){
                        int[] tmp = times[i]; times[i] = times[j]; times[j] = tmp;
                    }
            }
        }
        return;
    }
}
