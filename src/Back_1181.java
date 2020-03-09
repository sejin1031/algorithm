import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Back_1181 {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];
        for(int i = 0;i<N;i++) {
            words[i] = br.readLine();
        }
        Arrays.sort(words, (o1, o2) -> {
             return (o1.length() == o2.length()) ? o1.compareTo(o2) : Integer.compare(o1.length(), o2.length());
        });
        bw.write(words[0]);
        bw.newLine();
        for(int i = 1;i<N;i++){
            if(words[i].equals(words[i-1])) continue;
            bw.write(words[i]);
            bw.newLine();
        }
        bw.flush();
    }
}
