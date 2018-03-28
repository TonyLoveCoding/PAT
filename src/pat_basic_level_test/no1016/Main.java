package pat_basic_level_test.no1016;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/25.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int n = in.nextInt(), r = in.nextInt(), res = 0;

            while(n > 0){
                if(n % r == 1){
                    res ++;
                }
                n = n / r;
            }
            System.out.println(res);
        }
    }
}
