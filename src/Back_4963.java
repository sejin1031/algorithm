import java.util.ArrayList;
import java.util.Scanner;

public class Back_4963 {
    static int w;
    static int h;
    static boolean[][] visited;
    static int[][] v;
    static ArrayList<Integer> ans;
    static int result;
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        ans = new ArrayList<Integer>();
        while (true){
            w = scn.nextInt();
            h = scn.nextInt();
            if(w == 0 && h == 0) break;
            visited = new boolean[h][w];
            v = new int[h][w];
            result = 0;
            for(int i = 0;i<h;i++){
                for(int j = 0;j<w;j++){
                    v[i][j] = scn.nextInt();
                }
            }
            for(int i = 0;i<h;i++){
                for(int j = 0;j<w;j++){
                    if(!visited[i][j] && v[i][j] == 1){
                        result++;
                        dfs(i,j);
                    }
                }
            }
            ans.add(result);
        }
        for(int i = 0;i<ans.size();i++){
            if(i == ans.size()-1){
                System.out.print(ans.get(i));
            } else{
                System.out.println(ans.get(i));
            }
        }
    }

    private static void dfs(int i, int j) {
        visited[i][j] = true;
        if(j >0 && v[i][j-1] == 1 && !visited[i][j-1]){
            dfs(i,j-1);
        }
        if(j<w-1 && v[i][j+1] == 1 && !visited[i][j+1]){
            dfs(i,j+1);
        }
        if(i<h-1 && v[i+1][j] == 1 && !visited[i+1][j]){
            dfs(i+1,j);
        }
        if(j>0 && i<h-1 && v[i+1][j-1] == 1 && !visited[i+1][j-1]){
            dfs(i+1,j-1);
        }
        if(j<w-1 && i<h-1 && v[i+1][j+1] == 1 && !visited[i+1][j+1]){
            dfs(i+1,j+1);
        }
        if(i>0 && v[i-1][j] == 0 && !visited[i-1][j]){
            dfs(i-1,j);
        }
        if(i>0 && j>0 && v[i-1][j-1] == 1 && !visited[i-1][j-1]){
            dfs(i-1,j-1);
        }
        if(i>0 && j < w-1 && v[i-1][j+1] == 1 && !visited[i-1][j+1]){
            dfs(i-1,j+1);
        }
    }
}
