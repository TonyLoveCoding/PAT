package pat_basic_level_test.no1006;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/24.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] fib = new int[10001];
        fib[0]=1; fib[1] = 1;
        for(int i =2; i <= 10000;i++){
            fib[i] = (fib[i-1] + fib[i - 2]) % 10000;
        }

        while(in.hasNext()){
            int n = in.nextInt();
            int temp = 0;
            for(int i = 0; i < n; n++){
                temp = in.nextInt();
                System.out.printf("%04d",fib[temp]);
            }
            System.out.println();
        }
        in.close();
    }
}
