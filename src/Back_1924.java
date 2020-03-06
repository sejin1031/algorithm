import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1924 {
    public static void main(String... args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] days = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int total_days = 0;
        for(int i = 1;i<M;i++){
            total_days += month[i];
        }
        total_days += (D-1);
        System.out.print(days[total_days%7]);
    }
}
