import java.util.Scanner;

public class Back_10250 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for(int i = 0;i<T;i++){
            int H = scn.nextInt();
            int W = scn.nextInt();
            int N = scn.nextInt();
            System.out.println(Integer.toString(N%H)+(N/H<10?"0":"")+(N/H+1));
        }
    }
}
