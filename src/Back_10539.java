import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Back_10539 {
    public static void main(String... args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] b = new int[n+1];
        int[] a = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1;i<=n;i++) b[i] = Integer.parseInt(st.nextToken()) * i;
        a[1] = b[1];
        bw.write(Integer.toString(a[1])+" ");
        for(int i = 2;i<=n;i++){
            a[i] = b[i]-b[i-1];
            bw.write(Integer.toString(a[i])+" ");
        }
        bw.flush();

    }
}
