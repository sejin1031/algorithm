import java.util.Scanner;

public class Back_9366 {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        int[][] len = new int[T][3];
        String[] result = new String[T];
        for(int i = 0;i<T;i++){
            int same = 1;
            int max = Math.max(Math.max(len[i][0],len[i][1]),len[i][2]);
            if(max == len[i][0]){
                if(max >= len[i][1]+len[i][2]) same = 0;
            }
            else if(max == len[i][1]){
                if(max >= len[i][0]+len[i][2]) same = 0;
            }
            else if(max == len[i][2]){
                if(max >= len[i][1]+len[i][0]) same = 0;
            }

            if(same > 0) {
                for (int j = 0; j < 2; j++) {
                    for (int k = j + 1; k < 3; k++) {
                        if (len[i][j] == len[i][k]) same++;
                    }
                }
            }
            switch (same){
                case 0:
                    result[i] = "Case #"+(i+1)+": invalid!";
                    return;
                case 1:
                    result[i] = "Case #"+(i+1)+": scalene";
                    return;
                case 2:
                    result[i] = "Case #"+(i+1)+": isosceles";
                    return;
                case 3:
                    result[i] = "Case #"+(i+1)+": equilateral";
                    return;
            }
        }
        for(String ans : result) System.out.println(ans);
    }
}
