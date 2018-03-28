package pat_basic_level_test.no1015;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/24.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String n = in.next();

            int res = 0;
            for(int i = n.length() - 1; i >= 0; i --){
                int cur = Integer.parseInt(n.substring(i, i + 1));
                if(cur != 0){
                    res += cur * (Math.pow(2,n.length() - i) - 1);
                }
            }
            System.out.println(res);
        }
    }
}
