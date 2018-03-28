package pat_basic_level_test.no1025;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/25.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            BigInteger[] res = new BigInteger[3];
            for(int i = 0; i < 3; i++){
                res[i] = new BigInteger(in.next());
            }
            Arrays.sort(res);
            if(res[0].add(res[1]).compareTo(res[2]) > 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
