import java.util.Scanner;

public class OX {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
        int[] result = new int[test];
        for(int i = 0;i<test;i++) {
            String OX = scn.next();
            String[] str = OX.split("");
            int Ocount = 0;
            result[i] = 0;
            for(int j = 0;j<str.length;j++) {
                if(str[j].equals("X")) {
                    Ocount = 0;
                    
                }
                else if(str[j].equals("O")){
                    Ocount++;
                    result[i] += Ocount;
                }
            }
        }
        for(int i :result)
            System.out.println(i);
        
    }
}
