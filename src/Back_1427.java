import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Back_1427 {
    public static void main(String... args) throws IOException {
        Scanner scn = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = scn.next().split("");
        int[] nums = new int[str.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i<str.length;i++){
            pq.offer(Integer.parseInt(str[i]));
        }
        for(int i = nums.length-1;i>=0;i--) nums[i] = pq.poll();


        for(int i:nums) bw.write(Integer.toString(i));
        bw.flush();

    }
}
