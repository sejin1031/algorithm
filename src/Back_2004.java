import java.util.Scanner;

public class Back_2004 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        String result = Integer.toString(binomialCoeff(n,m));
        int count = 0;
        for(int i = result.length()-1;i>=0;i--){
            if(result.charAt(i) != '0'){
                break;
            }else{
                count++;
            }
        }
        System.out.print(count);
    }
    static int binomialCoeff(int n, int k)
    {
        int C[][] = new int[(int)(n+1)][(int)(k+1)];
        int i, j;

        // Calculate  value of Binomial Coefficient in bottom up manner
        for (i = 0; i <= n; i++)
        {
            for (j = 0; j <= Math.min(i, k); j++)
            {
                // Base Cases
                if (j == 0 || j == i)
                    C[i][j] = 1;

                    // Calculate value using previously stored values
                else
                    C[i][j] = C[i-1][j-1] + C[i-1][j];
            }
        }

        return C[n][k];
    }
}
