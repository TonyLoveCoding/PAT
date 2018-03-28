package pat_basic_level_test.no1032;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/28.
 */
public class Main {
//
//    f(1)=0;
//
//    f(i)=(f[i-1]+m)%i;(i>1)

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m,i,s;
        while(in.hasNext()){
            n = in.nextInt(); m = in.nextInt(); i = 0; s = 0;
            for(i = 2; i <= n; i++){
                s = (s+m) % i;
            }
            System.out.println(s + 1);
        }
    }
}
