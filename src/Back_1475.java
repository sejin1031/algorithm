import java.util.Scanner;

public class Back_1475 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        String[] num = scn.next().split("");
        int[] plastic = new int[10];
        int set = 1;
        for(int i = 0; i <10;i++) plastic[i] = 1;
        plastic[6]++;
        for(int i = 0;i<num.length;i++){
            int digit = Integer.parseInt(num[i]);
            if(digit == 6 || digit == 9){
                plastic[6]--;
                if(plastic[6] == -1) {
                    set++;
                    for(int j = 0;j<plastic.length;j++) plastic[j]++;
                    plastic[6]++;
                }
            }
            else{
                plastic[digit]--;
                if(plastic[digit] == -1) {
                    set++;
                    for(int j = 0;j<plastic.length;j++) plastic[j]++;
                    plastic[6]++;
                }
            }

        }
        System.out.println(set);
    }
}

