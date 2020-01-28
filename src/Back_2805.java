import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Back_2805 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArray = br.readLine().split(" ");

        int treeCount = Integer.parseInt(inputArray[0]);
        int minLengthTree = Integer.parseInt(inputArray[1]);


        String[] preTreeArray = br.readLine().split(" ");
        int[] treeArray = new int[treeCount];
        for(int i=0; i<preTreeArray.length; i++){
            treeArray[i] = Integer.parseInt(preTreeArray[i]);
        }
        Arrays.sort(treeArray);
        int lastInt = treeArray[treeCount-1];

        int maxHeight = lastInt;
        int minHeight = 0;
        int middle = 0;

        while(maxHeight >= minHeight){
            middle = (minHeight+maxHeight)/2;

            int cutTree = 0;
            long sumCutTree = 0;
            for(int j=0; j<treeArray.length; j++){

                cutTree = treeArray[j] - middle;

                if(cutTree <0){
                    cutTree = 0;
                }
                sumCutTree += cutTree;
            }

            if(sumCutTree >= minLengthTree){

                minHeight = middle + 1;
            }else if(sumCutTree < minLengthTree){

                maxHeight = middle - 1;

            }

        }

        System.out.println(maxHeight);
    }

}