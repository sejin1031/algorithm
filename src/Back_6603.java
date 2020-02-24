import java.util.ArrayList;
import java.util.Scanner;

public class Back_6603 {
    static int[] nums;
    static int[] result;
    static int N;
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        while(true){
            N = scn.nextInt();
            if(N == 0) break;
            nums = new int[N];
            result = new int[N];
            for(int i = 0;i<N;i++){
                nums[i] = scn.nextInt();
            }
            dfs(0,0);
            System.out.println();
        }

    }



    static void dfs(int start, int depth){
        if(depth == 6){
            print();
        }
        for(int i = start;i<N;i++){
            result[i] = 1;
            dfs(i+1,depth+1);
            result[i] = 0;
        }
    }

    public static void print(){
        for(int i = 0;i<N;i++){
            if(result[i] == 1)
                System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
