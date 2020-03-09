import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Back_11004 {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] nums = new int[N];
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int i = 0;i<N;i++){
            pq.offer(Integer.parseInt(st.nextToken()));
        }
        for(int i = 0;i<K;i++) nums[i] = pq.poll();
        System.out.print(nums[K-1]);
    }
}
