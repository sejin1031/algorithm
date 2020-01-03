import java.util.Scanner;

public class Blackjack {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        int maxSum = 0;
        int[] cards = new int[N];
        for(int i=0;i<N;i++) cards[i] = scn.nextInt();
        for(int i = 0;i<N-2;i++) {
            
            for(int j = i+1;j<N;j++) {
                
                for(int k = j+1;k<N;k++) {
                    
                    int sum = cards[i]+cards[j]+cards[k];
                    
                    if(sum<=M) {
                        maxSum = Math.max(sum, maxSum);
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}
