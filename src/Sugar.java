import java.util.Scanner;

public class Sugar {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int kg = scn.nextInt();
        if(kg%5 ==0) {
            System.out.println(kg/5);
            return;
        }
        else if(kg%5 !=0 && kg %3 != 0) {
            int count = kg/5;
            int result = -1;
            for(int i = count;i>0;i--) {
                if((kg-i*5)%3==0) {
                    result = i+(kg-i*5)/3;
                }
            }
            System.out.println(result);
            return;
        }
        else if(kg%3==0) {
            System.out.println(kg/3);
            return;
        }
        else {
            System.out.println(-1);
        }
        
    }
   
}
