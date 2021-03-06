import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Back_7562 {
    static int l;
    static int arr[][];
    static boolean visitied[][];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            l = Integer.parseInt(br.readLine());
            arr = new int[l][l];
            visitied = new boolean[l][l];
            String str[] = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            arr[y][x] = 1;

            str = br.readLine().split(" ");
            int x2 = Integer.parseInt(str[0]);
            int y2 = Integer.parseInt(str[1]);
            arr[y2][x2] = -1;
            if(x == x2 && y == y2)
                sb.append(0  + "\n");
            else
                bfs(x, y);
        }
        System.out.println(sb);
    }
    private static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<Point>();
        int dx[] = {1, 2, 2, 1, -1, -2, -2, -1};
        int dy[] = {-2, -1, 1, 2, 2, 1, -1, -2};
        q.add(new Point(x, y, 0));
        visitied[y][x] = true;
        while(!q.isEmpty()) {
            Point p = q.poll();
            for (int i = 0; i < 8; i++) {
                int nextX = p.getX() + dx[i];
                int nextY = p.getY() + dy[i];
                int step = p.getStep() + 1;
                if(nextX >= 0 && nextX < l && nextY >= 0 && nextY < l) {
                    if(arr[nextY][nextX] == -1) {
                        sb.append(step + "\n");
                        return ;
                    }
                    if(!visitied[nextY][nextX]) {
                        q.add(new Point(nextX, nextY, step));
                        visitied[nextY][nextX] = true;
                    }
                }
            }
        }

    }
}

class Point {

    int x;
    int y;
    int step;

    public Point(int x, int y, int step) {
        super();
        this.x = x;
        this.y = y;
        this.step = step;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
}