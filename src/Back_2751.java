import java.io.*;
import java.util.PriorityQueue;

public class Back_2751 {
    static int N;
    static PriorityQueue<Integer> pq;

    static {
        pq = new PriorityQueue<>();
    }

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for(int i = 1;i<=N;i++) pq.offer(Integer.parseInt(br.readLine()));
        while (!pq.isEmpty()){
            bw.write(Integer.toString(pq.poll()));
            bw.newLine();
        }
        bw.flush();

    }

}
