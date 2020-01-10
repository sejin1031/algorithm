import java.util.Scanner;

public class Back_1100 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        String[][] chess = new String[8][8];
        int result = 0;
        for(int i = 0;i<8;i++) chess[i] = scn.next().split("");
        for(int i = 0;i<8;i++){
            for(int j = 0;j<8;j++){
                if((i+1)%2 == (j+1) % 2){
                    if(chess[i][j].equals("F")) result++;
                }
            }
        }
        System.out.println(result);
    }
}
