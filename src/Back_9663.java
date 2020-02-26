import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_9663 {
    static int ans = 0;
    static int N;
    static boolean[][] chess;
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        chess = new boolean[N][N];
        dfs(0);
        System.out.print(ans);
    }
    static void dfs(int idx){
        if (idx == N){
            ans++;
        }
        for(int i = 0;i<N;i++){
            if(promising(idx,i)) continue;
            chess[idx][i] = true;
            dfs(idx+1);
            chess[idx][i] = false;
        }
    }
    static boolean promising(int i, int j){
        //idx부터 0까지 같은 col에 존재하는지 검사
        for(int k = i-1;k>=0;k--){
            if(chess[k][j]) return true;
        }
        //idx부터 왼쪽 위로 존재하는지 검사
        for(int k = i-1,l=j-1;k>=0&&l>=0;k--,l--){
            if(chess[k][l]) return true;
        }
        //idx부터 오른쪽 위로 존재하는지 검사
        for(int k = i-1,l=j+1;k>=0&&l<N;k--,l++){
            if(chess[k][l]) return true;
        }
        return false;
    }
}
