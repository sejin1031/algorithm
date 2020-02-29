import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_2210 {
    static int[][] nums = new int[5][5];
    static int[] digits = new int[1000000];
    static int[] x = {1,-1,0,0};
    static int[] y = {0,0,1,-1};

    static int ans = 0;
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "";
        for(int i = 0;i<5;i++){
            String[] str = br.readLine().split(" ");
            for(int j = 0;j<5;j++){
                nums[i][j] = Integer.parseInt(str[j]);
            }
        }
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                for(int dir = 0;dir<4;dir++){
                    int xx = i + x[dir];
                    int yy = j + y[dir];
                    if(xx<0 || yy < 0 || xx>=5 || yy >=5) continue;
                    else{
                        dfs(xx,yy,str1+nums[xx][yy]);
                    }
                }
            }
        }
        System.out.print(ans);
    }
    static void dfs(int i,int j,String str){
        if(str.length() == 6 && digits[Integer.parseInt(str)] == 0){
            digits[Integer.parseInt(str)] = 1;
            ans += 1;
            return;
        } else{
            for(int dir = 0; dir<4; dir++){
                int xx = i + x[dir];
                int yy = j + y[dir];
                if(xx<0 || yy <0 || xx >= 5 || yy >= 5) continue;
                else{
                    if(str.length() != 6){
                        dfs(xx,yy,str+nums[xx][yy]);
                    }
                }
            }
        }
    }
}
