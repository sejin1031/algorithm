import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1987 {
    static int R,C;
    static String[][] map;
    static String[] path;
    static int[] x = {1,-1,0,0};
    static int[] y = {0,0,1,-1};
    static boolean[] visited = new boolean[26];

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        R = Integer.parseInt(str[0]);
        C = Integer.parseInt(str[1]);
        map = new String[R+1][C+1];
        path = new String[R*C+1];
        for(int i = 0;i<R;i++){
            map[i] = br.readLine().split("");
        }
        visited[map[0][0].charAt(0) - 'A'] = true;
            System.out.print(dfs(0,0));

        }

        static int dfs(int i, int j){
            int maximum = 1;
            for(int dir = 0;dir<4;dir++){
                int xx = i + x[dir];
            int yy = j + y[dir];
            if(xx >= 0 && yy >= 0 && xx < R && yy < C){
                if(!visited[map[xx][yy].charAt(0)-'A']){
                    visited[map[xx][yy].charAt(0)-'A'] = true;
                    maximum = Math.max(maximum,dfs(xx,yy)+1);
                    visited[map[xx][yy].charAt(0)-'A'] = false;
                }
            }
        }
        return maximum;

    }
}
