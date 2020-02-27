import java.io.*;

public class Back_3187 {

    static int R,C;
    static String[][] map;
    static boolean[][] visited;
    static int totK = 0;
    static int totV = 0;
    static int k = 0;
    static int v = 0;
    static int[] x = {1,-1,0,0};
    static int[] y = {0,0,1,-1};

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        R = Integer.parseInt(s1[0]);
        C = Integer.parseInt(s1[1]);
        map = new String[R][C];
        visited = new boolean[R][C];
        for(int i = 0;i<R;i++){
            String[] s2 = br.readLine().split("");
            for(int j = 0;j<C;j++){
                map[i][j] = s2[j];
                if(map[i][j].equals("v")) totV++;
                else if(map[i][j].equals("k")) totK++;
            }
        }

        for(int i = 0;i<R;i++){
            for(int j = 0;j<C;j++){
                if(map[i][j].equals("#") || visited[i][j]) {
                    visited[i][j] = true;
                    continue;
                }
                k = 0; v = 0;
                dfs(i,j);
                if(v>=k) totK -= k;
                else totV -= v;
            }
        }
        System.out.print(totK + " " + totV);
    }
    static void dfs(int i, int j){
        visited[i][j] = true;
        if(map[i][j].equals("v")) v++;
        else if(map[i][j].equals("k")) k++;
        for(int dir = 0;dir<4;dir++){
            int xx = i + x[dir];
            int yy = j + y[dir];
            if(xx<0 || yy<0 || xx >= R || yy >=C) continue;
            else if(map[xx][yy].equals("#") || visited[xx][yy]){
                visited[xx][yy] = true;
                continue;
            }
            dfs(xx,yy);
        }
    }
}
