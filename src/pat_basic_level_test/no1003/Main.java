package pat_basic_level_test.no1003;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/23.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] list = new long[100];
        list[1] = 1; list[2] = 2;
        for(int i = 3; i < 100; i++){
            list[i] = list[i-1] + list[i-2];
        }
        while(in.hasNext()){
            int n = in.nextInt();
            System.out.println(list[n]);
        }
    }
}
