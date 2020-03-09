import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Back_10814 {

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[][] member = new String[N][2];
        for(int i = 0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            member[i][0] = st.nextToken();
            member[i][1] = st.nextToken();
        }
        Arrays.sort(member, (o1, o2) -> Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0])));
        for(int i = 0;i<N;i++){
            bw.write(member[i][0]+" "+member[i][1]);
            bw.newLine();
        }
        bw.flush();
    }
}
