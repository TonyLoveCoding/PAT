package pat_basic_level_test.no1017;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/25.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sym = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while(in.hasNext()){
            int n = in.nextInt(), r = in.nextInt();
            StringBuilder res = new StringBuilder();
            while(n > 0){
                if(n % r > 9){
                    res.append(sym.charAt((n % r) - 10));
                }
                else{
                    res.append(n % r);
                }
                n = n / r;
            }
            System.out.println(res.reverse().toString());
        }
    }
}
