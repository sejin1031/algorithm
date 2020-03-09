import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Back_1026 {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<N;i++) A[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<N;i++) B[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(A);
        Arrays.sort(B);
        int result = 0;
        for(int i = 0;i<N;i++){
            result += A[i] * B[N-i-1];
        }
        System.out.print(result);

    }
}
