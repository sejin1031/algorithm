import java.util.Scanner;

public class Bridge {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int testCase = scn.nextInt();
        int[] output = new int[testCase];
        for(int i = 0;i<testCase;i++){
            int a = scn.nextInt();
            int b = scn.nextInt();
            output[i] = coeff(b,a);
        }
        for(int i : output) {
            System.out.println(i);
        }
        scn.close();
    }
    
    static int coeff(int n, int k) 
    { 
        int C[] = new int[k + 1]; 
         
        C[0] = 1;   
       
        for (int i = 1; i <= n; i++) 
        { 
            for (int j = Math.min(i, k); j > 0; j--) 
                C[j] = C[j] + C[j-1]; 
        } 
        return C[k]; 
    } 
    
    
    
}
