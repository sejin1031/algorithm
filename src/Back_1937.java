import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1937 {
    static int[][] map;
    static int[][] dp;
    static int N;
    static int max = 0;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};


    public static void main(String... args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        dp = new int[N][N];
        for(int i = 0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0;j<N;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                ans=Math.max(ans, move(i,j));
            }
        }

        System.out.print(ans);

    }

    public static int move(int i, int j) {

        if(dp[i][j]!=0) return dp[i][j];

        int xx, yy;

        int day=1;
        for(int dir=0; dir<4; dir++) {
            xx = i + dx[dir];
            yy = j + dy[dir];
            if(xx>0 && xx<N && yy>0 && yy<N) {
                if(map[xx][yy] > map[i][j]) {
                    day=Math.max(move(xx,yy)+1, day);
                    dp[i][j]=day;
                }
            }
        }
        return day;
    }
}
