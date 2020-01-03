
public class SelfNum {
    public static void main(String... args) {
        boolean[] self = new boolean[10001];
        for(int i = 1;i<=10000;i++) self[i] = true;
        for(int i = 1;i<=10000;i++) {
            if(i<10) {
                self[i+i]=false;
            }
            else if(i<100) {
                self[i+i/10+i%10]=false;
            }
            else if(i<1000) {
                self[i+i/100+i%100/10+i%100%10] = false;
            }
            else if(i<10000) {
                if(i+i/1000+i%1000/100+i%1000%100/10+i%1000%100%10 <= 10000) {
                    self[i+i/1000+i%1000/100+i%1000%100/10+i%1000%100%10] =false;
                }
            }
            
        }
        for(int i = 1;i<=10000;i++) {
            if(self[i]) System.out.println(i);
        }

    }
}
