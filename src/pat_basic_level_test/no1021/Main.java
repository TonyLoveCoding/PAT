package pat_basic_level_test.no1021;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/25.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long[] res = new long[21], sum = new long[21];
        res[1] = 0; res[2] = 1;
        sum[1] = 1; sum[2] = 2;
        for(int i = 3; i <= 20; i++){
            res[i] = (i-1) * (res[i - 1] + res[i - 2]);
            sum[i] = i * sum[i - 1];
        }
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.printf("%.2f",(double)res[n] / (double)sum[n] * 100 );
            System.out.println("%");
        }
    }
}
