import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Back_14226 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        boolean[][] visit = new boolean[2000][2000];

        Queue<Status> q = new LinkedList<>();
        q.add(new Status(1,0,0));
        while (!q.isEmpty()){
            Status cur = q.poll();
            if(cur.cur == S){
                System.out.print(cur.sec);
                return;
            }
            if(cur.cur > 0 && cur.cur < 2000){

                if(!visit[cur.cur][cur.cur]){
                    visit[cur.cur][cur.cur] = true;
                    q.offer(new Status(cur.cur,cur.cur,cur.sec+1));
                }

                if(!visit[cur.cur-1][cur.buf]){
                    visit[cur.cur-1][cur.buf] = true;
                    q.offer(new Status(cur.cur-1,cur.buf,cur.sec+1));
                }
            }

            if(cur.buf > 0 && cur.cur+cur.buf < 2000){
                if(!visit[cur.cur+cur.buf][cur.buf]){
                    visit[cur.cur+cur.buf][cur.buf] = true;
                    q.offer(new Status(cur.cur+cur.buf,cur.buf,cur.sec+1));
                }
            }
        }
    }
    static class Status{
        int cur;
        int buf;
        int sec;
        public Status(int cur, int buf, int sec){
            this.cur = cur;
            this.buf = buf;
            this.sec = sec;
        }
    }
}
