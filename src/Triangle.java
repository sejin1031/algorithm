import java.util.Scanner;

public class Triangle{
    public static String process(int a, int b,int c) {
        if(a==b && b==c)
            return "equilateral";
        else if(a==b && b != c || a == c && a != b ||
                b==c && a !=b)
            return "isosceles";
        else
            return "invalid!";
    }
    
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int testCase = scn.nextInt();
        String[] output = new String[testCase];
        for(int i = 0;i<testCase;i++){
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            output[i] = process(a,b,c);
        }
        for(int i = 0;i<output.length;i++) {
            System.out.println("Case #"+(i+1)+": "+output[i]);
        }
        scn.close();
    }
    
}
