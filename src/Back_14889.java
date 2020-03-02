import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back_14889 {
    static int N;
    static int stat[][];
    static int[] start_team;
    static int[] link_team;

    static boolean[] visited;

    static int min = Integer.MAX_VALUE;

    static int stoi(String s){return Integer.parseInt(s);}

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = stoi(br.readLine());
        stat = new int[N][N];
        start_team = new int[N/2];
        link_team = new int[N/2];

        visited = new boolean[N];

        for(int i = 0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0;j<N;j++){
                stat[i][j] = stoi(st.nextToken());
            }
        }
        visited[0] = true;
        start_team[0] = 0;
        dfs(0,0);
        System.out.print(min);
    }

    static void dfs(int start,int idx){
        if(idx == N/2-1){
            addLink();
        //    printTeam();
            calcMin();
        }

        else if(idx+1<=N/2){
            for(int i = start;i<N;i++){
                if(visited[i]) continue;
                visited[i] = true;
                start_team[idx] = i;
                dfs(i+1,idx+1);
                visited[i] = false;
            }
        }

    }

    static void addLink(){
        int idx = 0;
        for(int i = 0;i<N;i++){
            if(!visited[i] && idx < N/2) {
                link_team[idx] = i;
                idx+=1;
            }
        }
    }

    static void calcMin(){
        int start = 0;
        int link = 0;
        for(int i = 0;i<N/2;i++){
            for(int j = 0;j<N/2;j++){
                start += stat[start_team[i]][start_team[j]];
                link += stat[link_team[i]][link_team[j]];
            }
        }
  //      System.out.println("start:"+start + "link:"+link);
        min = Math.min(min,Math.abs(start-link));
    }
/*
    static void printTeam(){
        System.out.print("start: ");
        Arrays.stream(start_team).sorted().forEach(x->System.out.print(x+" "));
        System.out.println();
        System.out.print("link: ");
        Arrays.stream(link_team).sorted().forEach(x->System.out.print(x+" "));
        System.out.println();
    }
    */
}
