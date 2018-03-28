package pat_basic_level_test.no1018;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/25.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int sum = 0, n = in.nextInt(), r = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            while(n > 0){
                list.add(n % r);
                n = n / r;
            }
            for(int i : list){
                sum += i;
            }
            String sym = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            StringBuilder res = new StringBuilder();
            while(sum > 0){
                if(sum % r > 9){
                    res.append(sym.charAt((sum % r) - 10));
                }
                else{
                    res.append(sum % r);
                }
                sum /= r;
            }
            System.out.println(res.reverse().toString());
        }
    }
}
