import java.util.Scanner;

public class Back_5218 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        int[][] dis = new int[T][];
        for(int i = 0; i<T;i++){
            String a = scn.next();
            String b = scn.next();
            dis[i] = new int[a.length()];
            for(int j = 0;j<a.length();j++){
                int diff = b.charAt(j) - a.charAt(j);
                dis[i][j] = diff >= 0 ? diff : (diff + 26);
            }
        }
        for (int i = 0;i<T;i++){
            System.out.print("Distances: ");
            for(int j = 0;j<dis[i].length;j++){
                System.out.print(dis[i][j] + " ");
            }
            System.out.println();
        }
    }
}
