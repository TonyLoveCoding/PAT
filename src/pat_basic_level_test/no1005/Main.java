package pat_basic_level_test.no1005;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/24.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] list = new int[100001];
        list[0] = 1; list[1] = 1;
        for(int i = 2; i<= 100000; i ++){
            list[i] = (list[i - 1] + list[i - 2]) % 1000000;
        }
        while(in.hasNext()){
            int n = in.nextInt();

            System.out.printf((n < 25? "%d":"%06d\n"),list[n]);
        }
    }
}
