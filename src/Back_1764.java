import java.util.Arrays;
import java.util.Scanner;

public class Back_1764 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        String[] noListen = new String[N];
        String[] noSaw = new String[M];
        int count = 0;
        for(int i = 0;i<N;i++) noListen[i] = scn.next();
        for(int i = 0;i<M;i++) noSaw[i] = scn.next();

        for(int i = 0;i<N;i++){
            if(Arrays.asList(noSaw).contains(noListen[i])){

            }
        }
    }
}
