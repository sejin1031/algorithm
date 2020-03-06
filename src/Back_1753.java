import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_1753 {
    static int V,E,start;
    static int[][] graph;
    static boolean[] visited;
    static int[] distance;

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        V = Integer.parseInt(str[0]);
        E = Integer.parseInt(str[1]);
        start = Integer.parseInt(br.readLine());
        graph = new int[V+1][V+1];
        visited = new boolean[V+1];
        distance = new int[V+1];
        for(int i = 0;i<E;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph[a][b] = c;

        }
        dikstra();
    }
    static void dikstra(){
        for(int i = 1;i<=V;i++){
            distance[i] = Integer.MAX_VALUE;
        }
        distance[start] = 0;
        visited[start] = true;

        for(int i = 1; i<=V;i++){
            if(!visited[i] && graph[start][i] != 0){
                distance[i] = graph[start][i];
            }
        }

        for(int a = 0;a<V-1;a++){

            int min = Integer.MAX_VALUE;
            int min_index = 0;

            for(int i = 1; i<=V;i++){
                if(!visited[i] && distance[i] != Integer.MAX_VALUE){
                    if(distance[i] < min){
                        min = distance[i];
                        min_index = i;
                    }
                }
            }
            visited[min_index] = true;
            for(int i = 1;i<=V;i++){
                if(!visited[i] && graph[min_index][i] != 0){
                    if(distance[i] > distance[min_index] + graph[min_index][i]){
                        distance[i] = distance[min_index] + graph[min_index][i];
                    }
                }
            }
        }
        for(int i = 1;i<=V;i++){
            System.out.println(distance[i] == Integer.MAX_VALUE ? "INF":distance[i]);
        }
    }
}
