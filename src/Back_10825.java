import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Back_10825 {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[][] students = new String[N][4];
        for (int i = 0; i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0;j<4;j++) students[i][j] = st.nextToken();
        }
        Arrays.sort(students, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])
                && Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])
                && Integer.parseInt(o1[3]) == Integer.parseInt(o2[3])){
                    return o1[0].compareTo(o2[0]);
                } else if(Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])
                        && Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])){
                    return Integer.compare(Integer.parseInt(o2[3]),Integer.parseInt(o1[3]));
                } else if(Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])) {
                    return Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
                }
                    return Integer.compare(Integer.parseInt(o2[1]),Integer.parseInt(o1[1]));
            }
        });
        for(String[] str:students) System.out.println(str[0]);

    }
}
