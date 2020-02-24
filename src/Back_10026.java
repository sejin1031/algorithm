import java.util.Scanner;

public class Back_10026 {
    static String[][] img;
    static String[][] imgRB;
    static boolean[][] visitied;
    static int abnormal = 0;
    static int normal = 0;
    static int N;
    static int[] xx = {1,-1,0,0};
    static int[] yy = {0,0,1,-1};

    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        N = scn.nextInt();
        img = new String[N][N];
        imgRB = new String[N][N];
        visitied = new boolean[N][N];
        for(int i = 0;i<N;i++){
            String[] str = scn.next().split("");
            for(int j = 0;j<N;j++){
                img[i][j] = str[j];
                imgRB[i][j]
                        = (str[j].equals("G") || str[j].equals("R")) ? "R" : "B";
            }
        }
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                if(!visitied[i][j]){
                    normal++;
                    dfs(i,j);
                }
            }
        }
        visitied = new boolean[N][N];
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                if(!visitied[i][j]){
                    abnormal++;
                    dfs2(i,j);
                }
            }
        }
        System.out.println(normal+" "+abnormal);
    }

    public static void dfs(int i, int j){
        visitied[i][j] = true;
        for(int dir = 0;dir<4;dir++){
            int x = i + xx[dir];
            int y = j + yy[dir];
            if(x>=0 && y>=0 && x<N && y<N
            && !visitied[x][y] && img[i][j].equals(img[x][y])){
                visitied[x][y] = true;
                dfs(x,y);
            }
        }
    }

    public static void dfs2(int i, int j){
        visitied[i][j] = true;
        for(int dir = 0;dir<4;dir++){
            int x = i + xx[dir];
            int y = j + yy[dir];
            if(x>=0 && y>=0 && x<N && y<N
                    && !visitied[x][y] && imgRB[i][j].equals(imgRB[x][y])){
                visitied[x][y] = true;
                dfs2(x,y);
            }
        }
    }
}
