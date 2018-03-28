package pat_basic_level_test.no1004;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/23.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long[] list = new long[100];
        list[1] = 1; list[2] = 1;
        for(int i = 3; i<= 90; i++){
            list[i] = list[i-1] + list[i-2];
        }
        while(in.hasNext()){
            int from = in.nextInt(), to = in.nextInt();
            long res = 0;
            for(int i = from; i <= to; i++){
                res += list[i];
            }
            System.out.println(res);
        }
    }
}
