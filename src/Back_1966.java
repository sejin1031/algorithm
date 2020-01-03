import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Back_1966 {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
        int[] result = new int[test];
        for(int i = 0;i<test;i++) {
            int len = scn.nextInt();
            int idx = scn.nextInt();
            int cnt = 0;
            int ans = 0;
            Queue<Integer> q = new LinkedList<Integer>();
            for(int j = 0;i<len;i++) {
                int element = scn.nextInt();
                q.add(element);
                if(j == idx)
                    ans = element;
            }
            int max =  0;
            for(int j = 0;j<q.size();j++){
                Queue<Integer> temp= q;
                if(temp.poll() >= max){

                }
                
                
            }
        }
    }
}
