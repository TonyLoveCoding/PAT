package pat_basic_level_test.no1009;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/24.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] fib = new long[103];
        fib[0] = 1; fib[1] = 1;
        for(int i = 2; i < 103; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            if(a > b){
                System.out.println("0");
                continue;
            }
            if(a == b){
                System.out.println("1");
                continue;
            }
            System.out.println(fib[b - a]);
        }
    }
}
