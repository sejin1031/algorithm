import java.io.*;
import java.util.ArrayList;

public class Back_10828 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static class Stack{
        ArrayList<String> al;
        int top;
        public Stack(){
            this.al = new ArrayList<>();
            top = 0;
        }
        void push(String n){
            al.add(top++,n);
        }
        void pop() throws IOException {
            if(al.size() == 0) {
                bw.write("-1");
                bw.newLine();
            }
            else{
                bw.write(al.get(top-1));
                bw.newLine();
                al.remove(top-- -1);
            }
        }
        void size() throws IOException{
            bw.write(Integer.toString(al.size()));
            bw.newLine();
        }
        void empty() throws IOException{
            bw.write(al.size() == 0?"1":"0");
            bw.newLine();
        }
        void top() throws IOException{
            bw.write(al.size() == 0?"-1":al.get(top-1));
            bw.newLine();
        }


    }
    public static void main(String... args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] command;
        Stack stk = new Stack();
        for(int i = 0;i<N;i++){
            command = br.readLine().split(" ");
            if(command[0].equals("push")){
                stk.push(command[1]);
            } else if(command[0].equals("pop")){
                stk.pop();
            } else if(command[0].equals("size")){
                stk.size();
            } else if(command[0].equals("empty")){
                stk.empty();
            } else{
                stk.top();
            }
        }
        bw.flush();
    }
}
