package pat_basic_level_test.no1023;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/25.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long[] c = new long[21], f = new long[21];

        f[0] = 1; f[1] = 0; f[2] = 1;
        c[0] = 1; c[1] = 1; c[2] = 2;

        for(int i = 3; i <= 20; i++){
            f[i] = (i - 1) * (f[i - 1] + f[i - 2]);
            c[i] = i * c[i - 1];
        }
        while (in.hasNext()){
            int n = in.nextInt(), m = in.nextInt();
            long res1 = c[n] / c[m] / c[n - m];
            System.out.println(f[m] * res1);
        }
    }

}
