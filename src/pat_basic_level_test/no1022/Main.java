package pat_basic_level_test.no1022;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/25.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            int n = in.nextInt();
            if(n == 0){
                break;
            }
            int count = 0;
            while(n != 1 && n != 0){
                if(n % 3 != 0)
                    n = n / 3 + 1;
                else
                    n = n / 3;
                count++;
            }
            System.out.println(count);
        }
    }
}
