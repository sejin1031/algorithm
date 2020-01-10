import java.util.Scanner;

public class Back_1316 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int count = 0;
        String[] words = new String[N];
        for(int i = 0;i<N;i++) words[i] = scn.next();
        scn.close();
        for(int i = 0;i<N;i++){
            boolean[] check = new boolean[26];
            boolean flag = true;
            String word = words[i];
            if(word.length() > 1){
                char cur = ' ';
                char prev = word.charAt(0);
                check[word.charAt(0)-97] = true;

                for(int j = 1;j<word.length();j++){
                    cur = word.charAt(j);

                    if(cur == prev) continue;
                    else{
                        if(check[word.charAt(j)-97]) {
                            flag = false;
                            break;
                        }
                        else{
                            check[word.charAt(j)-97] = true;
                            prev = cur;
                        }
                    }
                }
            }
            if(flag) count++;

        }
        System.out.println(count);
    }
}
