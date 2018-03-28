package pat_basic_level_test.no1007;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/24.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] fib = new int[60];
        fib[1] = 1; fib[2] = 2; fib[3] = 3;
        for(int i = 4; i <= 60; i++){
            fib[i] = fib[i - 1] + fib[i - 3];
        }
        while(in.hasNext()){
            int n = in.nextInt();

            System.out.println(fib[n]);
        }
        in.close();
    }
}
