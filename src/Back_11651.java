import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Back_11651 {
    public static void main(String... args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] pos = new int[N][2];
        for(int i = 0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            pos[i][0] = Integer.parseInt(st.nextToken());
            pos[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(pos, (o1, o2) -> o1[1] == o2[1]? Integer.compare(o1[0],o2[0]) : Integer.compare(o1[1],o2[1]));
        for(int i = 0; i<N;i++){
            bw.write(pos[i][0] +" "+ pos[i][1]);
            bw.newLine();
        }
        bw.flush();
    }
}
