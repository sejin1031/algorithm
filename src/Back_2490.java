import java.util.Scanner;

public class Back_2490 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int[] yut = new int[3];
        char[] str = {'D','C','B','A','E'};
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){
                yut[i] += scn.nextInt();
            }
        }
        for(int i:yut) System.out.println(str[i]);
    }
}
