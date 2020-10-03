import java.util.*;

public class Back_13913 {

    public static final int MAX = 200000;

    static void print(int[] pre, int n, int k) {
        if(n != k)
            print(pre, n, pre[k]);
        System.out.print(k + " ");
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] pre = new int[MAX+5];
        boolean[] check = new boolean[MAX+5];
        int[] d = new int[MAX+5];

        check[n] = true;
        d[n] = 0;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(n);
        while(!q.isEmpty()) {
            int x = q.remove();
            if(x-1 >=0) {
                if(!check[x-1]) {
                    q.add(x-1);
                    check[x-1]=true;
                    d[x-1]=d[x]+1;
                    pre[x-1]=x;
                }
            }
            if(x+1 < MAX) {
                if(!check[x+1]) {
                    q.add(x+1);
                    check[x+1]=true;
                    d[x+1]=d[x]+1;
                    pre[x+1]=x;
                }
            }
            if(x*2 < MAX) {
                if(!check[x*2]) {
                    q.add(x*2);
                    check[x*2]=true;
                    d[x*2]=d[x]+1;
                    pre[x*2]=x;
                }
            }
        }
        System.out.println(d[k]);
        print(pre, n, k);
        System.out.println();

    }
}