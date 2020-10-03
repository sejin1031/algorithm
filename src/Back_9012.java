import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Back_9012 {
    static int A,B,T;
    static boolean visited[];
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String... args) throws Exception{
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();
        visited = new boolean[10000];
        for(int i = 0;i<T;i++){
            A = sc.nextInt();
            B = sc.nextInt();
            Arrays.fill(visited,false);
            bfs();
        }
        bw.flush();
    }
    static void bfs() throws IOException {
        Queue<DSLR> q = new LinkedList<>();
        q.offer(new DSLR(A,new StringBuilder("")));
        visited[A] = true;
        while(!q.isEmpty()){
            DSLR cur = q.poll();
            if(cur.sb.length() >10000) continue;
            visited[cur.cur] = true;
            if(cur.cur == B){
                bw.write(cur.sb.toString()+"\n");
                return;
            }
            if(!visited[D(cur.cur)]){
                StringBuilder sb = new StringBuilder();
                sb.append(cur.sb);
                sb.append("D");
                q.offer(new DSLR(D(cur.cur),sb));
            }
            if(!visited[S(cur.cur)]){
                StringBuilder sb = new StringBuilder();
                sb.append(cur.sb);
                sb.append("S");
                q.offer(new DSLR(S(cur.cur),sb));
            }
            if(!visited[L(cur.cur)]){
                StringBuilder sb = new StringBuilder();
                sb.append(cur.sb);
                sb.append("L");
                q.offer(new DSLR(L(cur.cur),sb));
            }
            if(!visited[R(cur.cur)]){
                StringBuilder sb = new StringBuilder();
                sb.append(cur.sb);
                sb.append("R");
                q.offer(new DSLR(R(cur.cur),sb));
            }
        }
    }
    static int D(int num){
        return (num * 2) % 10000;
    }
    static int S(int num){
        return num > 0 ? num -1 : 9999;
    }
    static int L(int num){
        String str = Integer.toString(num);
        if(str.length() == 1) return num;
        str = str.substring(1,str.length()-1) + str.charAt(0);
        return Integer.parseInt(str);
    }
    static int R(int num){
        String str = Integer.toString(num);
        if(str.length() == 1) return num;
        str = str.charAt(str.length()-1) + str.substring(0,str.length()-1);
        return Integer.parseInt(str);
    }

    static class DSLR{
        int cur;
        StringBuilder sb;
        public DSLR(int cur, StringBuilder sb){
            this.cur = cur;
            this.sb = sb;
        }
    }
}
