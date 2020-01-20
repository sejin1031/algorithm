import java.util.Scanner;

public class Back_14501 {
    static int n, ans;
    static int[] p = new int[16], t = new int[16];
    static void go(int day, int total){
        if(day==n){
            ans = Math.max(ans, total);
            return;
        }
        go(day+1, total);
        if(day+t[day]<=n)
            go(day+t[day], total+p[day]);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        for(int i=0; i<n; i++){
            t[i] = scn.nextInt();
            p[i] = scn.nextInt();
        }
        go(0,0);
        System.out.println(ans);
        scn.close();
    }
}