import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Back_1759 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int L,C;
    static String[] alp;
    static String[] ans;
    static boolean[] visited;
    static String vowel = "aeiou";

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        L = Integer.parseInt(s1[0]);
        C = Integer.parseInt(s1[1]);
        alp = new String[C];
        ans = new String[L];
        visited = new boolean[C];
        for(int i = 0;i<C;i++){
            alp[i] = s2[i];
        }
        Arrays.sort(alp);
        dfs(0,0);
        bw.flush();
    }
    static void dfs(int start,int idx) throws IOException{
        if(idx == L){
            if(count()) {
                for (int i = 0; i < L; i++) {
                    bw.write(ans[i]);
                }
                bw.newLine();
            }
        }
        else if(idx+1<=L) {
            for (int i = start; i < C; i++) {
                if (visited[i]) continue;
                visited[i] = true;
                ans[idx] = alp[i];
                dfs(i + 1, idx + 1);
                visited[i] = false;
            }
        }
    }
    static boolean count(){
        int vow = 0;
        int cons = 0;
        for(int i = 0;i<L;i++){
            if(vowel.indexOf(ans[i]) != -1) vow++;
            else cons++;
        }
        if(vow >=1 && cons >=2) return true;
        else return false;
    }
}
