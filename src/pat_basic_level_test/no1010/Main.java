package pat_basic_level_test.no1010;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/24.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] fib = new long[95];
        fib[0] = 1; fib[1] = 1;
        for(int i = 2; i < 95; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        while(in.hasNext()){
            int n = in.nextInt();
            System.out.println(fib[n]);
        }
    }
}
