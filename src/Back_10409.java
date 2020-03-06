import java.io.*;
import java.util.StringTokenizer;

public class Back_10409 {
    public static void main(String... args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int[] times = new int[n];
        int sum = 0;
        int ans = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n;i++) times[i] = Integer.parseInt(st.nextToken());

        for(int i = 0;i<n;i++){
            sum += times[i];
            if(sum > T){
                ans = i;
                break;
            }
            ans = i+1;
        }
        bw.write(Integer.toString(ans));
        bw.flush();
    }
}
