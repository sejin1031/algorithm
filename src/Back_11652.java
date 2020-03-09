import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Back_11652 {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long max = -1;
        long ans = 0;
        HashMap<Long,Long> cards = new HashMap<>();
        for(int i = 0;i<N;i++){
            long num = Long.parseLong(br.readLine());
            if(cards.containsKey(num)){
                cards.put(num,cards.get(num)+1);

                if(cards.get(num) > N/2){
                    System.out.print(num);
                    return;
                }
                if(cards.get(num) > max){
                    max = cards.get(num);
                    ans = num;
                } else if(cards.get(num) == max){
                    if(num < ans){
                        ans = num;
                    }
                }
            } else{
                cards.put(num, (long) 1);
                if( 1 > max ){
                    max = 1;
                    ans = num;
                }else if( max == 1 ){

                    if(num < ans){
                        ans = num;
                    }

                }
            }

        }
        System.out.print(ans);
    }
}
