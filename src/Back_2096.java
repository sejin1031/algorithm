import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_2096 {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] min = new int[3][3];
        int[][] max = new int[3][3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        min[0][0] = max[0][0] = Integer.parseInt(st.nextToken());
        min[0][1] = max[0][1] = Integer.parseInt(st.nextToken());
        min[0][2] = max[0][2] = Integer.parseInt(st.nextToken());
        for(int i = 1;i<N;i++){
            st = new StringTokenizer(br.readLine());
            min[1][0] = max[1][0] = Integer.parseInt(st.nextToken());
            min[1][1] = max[1][1] = Integer.parseInt(st.nextToken());
            min[1][2] = max[1][2] = Integer.parseInt(st.nextToken());

            max[2][0] = max[1][0] + Math.max(max[0][0],max[0][1]);
            max[2][1] = max[1][1] + Math.max(max[0][0],Math.max(max[0][1],max[0][2]));
            max[2][2] = max[1][2] + Math.max(max[0][1],max[0][2]);

            min[2][0] = min[1][0] + Math.min(min[0][0],min[0][1]);
            min[2][1] = min[1][1] + Math.min(min[0][0],Math.min(min[0][1],min[0][2]));
            min[2][2] = min[1][2] + Math.min(min[0][1],min[0][2]);

            for(int j = 0;j<3;j++){
                max[0][j] = max[2][j];
                min[0][j] = min[2][j];
            }
        }
        System.out.print(Math.max(max[0][0],Math.max(max[0][1],max[0][2]))+" "+
                Math.min(min[0][0],Math.min(min[0][1],min[0][2])));
    }
}
