package pat_basic_level_test.no1027;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/25.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal m, n;
        while (in.hasNext()){
            n = in.nextBigDecimal(); m = in.nextBigDecimal();
            System.out.println(get(n,m));
        }
    }
    private static String get(BigDecimal m, BigDecimal n){
        BigDecimal res = null;
        if(m.divideAndRemainder(new BigDecimal("2"))[1].compareTo(BigDecimal.ZERO) == 0 ||
                n.divideAndRemainder(new BigDecimal("2"))[1].compareTo(BigDecimal.ZERO) == 0){
            res = m.multiply(n);
        }
        else{
            res = m.multiply(n).add(new BigDecimal("0.41"));
        }
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(res);
    }
}
