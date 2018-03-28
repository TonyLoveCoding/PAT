package pat_basic_level_test.no1026;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/25.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        while (in.hasNext()){
            int a = in.nextInt(), b = in.nextInt(), n = in.nextInt();
            System.out.print("0.");
            while(n -- > 0){
                a *= 10;
                temp = a/b;
                a = a % b;
                System.out.print(temp);
            }
            System.out.println();
        }
    }
}
