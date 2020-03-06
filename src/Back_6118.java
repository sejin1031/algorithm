import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_6118 {
    static int N,M;

    static int[][] pos;

    static boolean[] visited;
    static int[] dis;

    static int ans_len;
    static int ans_idx;
    static int ans_num = 0;

    static int stoi(String s){return Integer.parseInt(s);}

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = stoi(st.nextToken());
        M = stoi(st.nextToken());
        pos = new int[M*2][2];

        visited = new boolean[N+1];
        dis = new int[N+1];
        for(int i = 0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int[] ar = {stoi(st.nextToken()),stoi(st.nextToken())};
            pos[i] = ar;
        }

        //print();
        dikstra();
        calc_max();
        calc_idxNum();
        System.out.print(ans_idx+" "+ans_len+" "+ans_num);

    }

    static boolean is_exist(int s, int e){
        for(int i = 0;i<M;i++){
            if(pos[i][0] == s && pos[i][1] == e
            || pos[i][0] == e && pos[i][1] == s) return true;
        }
        return false;
    }
    static void dikstra(){
        for(int i = 2;i<=N;i++){
            dis[i] = Integer.MAX_VALUE;
        }
        visited[1] = true;

        for(int i = 1;i<=N;i++){
            if(!visited[i] && is_exist(1,i)){
                dis[i] = 1;
            }
        }

        for(int a = 0;a<N-1;a++){

            int min = Integer.MAX_VALUE;
            int min_index = 1;

            for(int i = 1; i<=N;i++){
                if(!visited[i] && dis[i] != Integer.MAX_VALUE){
                    if(dis[i] < min){
                        min = dis[i];
                        min_index = i;
                    }
                }
            }
            visited[min_index] = true;
            for(int i = 1;i<=N;i++){
                if(!visited[i] && is_exist(min_index,i)){
                    if(dis[i] > dis[min_index] + 1){
                        dis[i] = dis[min_index] + 1;
                    }
                }
            }
            printDis();
        }
    }
    static void calc_max(){
        int max = Integer.MIN_VALUE;
        for(int i = 1;i<=N;i++){
            max = Math.max(max,dis[i]==Integer.MAX_VALUE?0:dis[i]);
        }
        ans_len = max;
    }
    static void calc_idxNum(){
        boolean flag = true;
        for(int i = 1;i<=N;i++){
            if(dis[i] == ans_len){
                if(flag){
                    ans_idx = i;
                    ans_num++;
                    flag = false;
                } else ans_num++;

            }
        }
    }
//    static void print(){
//        for(int i = 1;i<=N;i++){
//            for(int j = 1;j<=N;j++){
//                System.out.print(map[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
    static void printDis(){
        for(int i = 1;i<=N;i++){
            System.out.print(dis[i]+" ");
        }
        System.out.println();
    }
}
