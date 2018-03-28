package pat_basic_level_test.no1033;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/28.
 */
public class Main {
//    尝试暴力
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int count = 0, n = in.nextInt();
            while(n != 1){
                if(n % 2 == 0){
                    n = n /2;
                }
                else{
                    n = (3 * n + 1) / 2;
                }
                count ++;
            }
            System.out.println(count);
        }
    }
}
