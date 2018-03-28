package pat_basic_level_real.no1001;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/29.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for(int i = 1; i <= n;i ++){
            String s1 = in.next(), s2= in.next(), s3 = in.next();
            BigDecimal a = new BigDecimal(s1), b = new BigDecimal(s2), c = new BigDecimal(s3);
            boolean res = false;
            if(a.add(b).compareTo(c) > 0) res = true;
            System.out.println("Case #" + i + ": " + res);
        }
    }
}
