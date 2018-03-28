package pat_basic_level_test.no1008;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/24.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] fib = new long[100];
        fib[1] = 1; fib[2] = 2;
        for(int i = 3; i < 100; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        while(in.hasNext()){
            int n = in.nextInt();

            System.out.println(fib[n]);
        }
        in.close();
    }
}
