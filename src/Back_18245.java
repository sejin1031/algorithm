import java.util.ArrayList;
import java.util.Scanner;

public class Back_18245 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<String>();
        String crypt = "";
        while(true){
            crypt = scn.nextLine();
            if(crypt.equals("Was it a cat I saw?"))
                break;
            else al.add(crypt);
        }
        int len = al.size();
        for(int i = 0;i<len;i++){
            crypt = al.get(i);
            for(int j = 0;j<crypt.length();j+=(i+2)){
                System.out.print(crypt.charAt(j));
            }
            System.out.println();
        }
    }
}
