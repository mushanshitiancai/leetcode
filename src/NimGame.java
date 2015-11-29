/**
 * Created by mazhibin on 15/11/29.
 */
public class NimGame {
    public boolean canWinNim_outofmemory(int n) {
        if(n<4) return true;
        boolean[] a = new boolean[n];
        a[0] = a[1] = a[2] = true;
        for(int i=3;i<n;i++){
            a[i] = !(a[i-1] && a[i-2] && a[i-3]);
        }
        return a[n-1];
    }

    public boolean canWinNim_TimeLimitExceeded(int n){
        if(n<4) return true;
        boolean[] a = {true,true,true,false};
        int index = 2;
        for(int i=3;i<n;i++){
            index++;
            if(index >= 4) index = 0;
            a[index] = true;
            a[index] = !(a[0] && a[1] && a[2] && a[3]);
        }
        return a[index];
    }

    public boolean canWinNim_TimeLimitExceeded2(int n){
        if(n<4) return true;
        boolean[] a = {true,true,true,false};
        int i=3;
        for(;i<n;i++){
            int index = i%4;
            a[index] = true;
            a[index] = !(a[0] && a[1] && a[2] && a[3]);
        }
        return a[(i-1)%4];
    }

    public boolean canWinNim_fuck(int n){
        return (n-1) % 4 != 3;
    }

    public boolean canWinNim(int n){
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        NimGame o = new NimGame();

        int[] test = {4,5,6,7,8,9,1348820612};
        for (int aTest : test) {
            System.out.println(o.canWinNim(aTest));
        }

//        for(int i=1;i<100;i++){
//            System.out.println(o.canWinNim(i));
//        }
    }
}
