package pat_basic_level_test.no1024;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/25.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] res = new int[31];
        res[1] = 1;
        for(int i = 2; i <= 30; i++){
            res[i] = (res[i - 1] + 1) * 2;
        }
        while (in.hasNext()){
            int n = in.nextInt();
            if(n == 0){
                continue;
            }
            System.out.println(res[n]);
        }
    }
}
