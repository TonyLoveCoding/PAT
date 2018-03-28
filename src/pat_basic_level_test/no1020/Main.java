package pat_basic_level_test.no1020;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/25.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            int n = in.nextInt();

            long[] res = new long[n + 1];
            res[0] = 1; res[2] = 1;
            for(int i = 2; i <= n; i++){
                res[i] = (i-1) * (res[i - 1] + res[i - 2]);
            }
            System.out.println(res[n]);
        }
    }
}
