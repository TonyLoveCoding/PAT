package pat_basic_level_test.no1031;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/28.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] length;
        int max=0;
        while(in.hasNext()){
            length = new int[10];
            String n = in.next();
            char[] count = n.toCharArray();
            for(char i : count)
                length[i - '0'] ++ ;
            for(int i = 0; i < 10; i++) {
                if(max < length[i]) max = length[i];
            }
            for (int i = max; i >= 1; i--) {
                for (int j = 0; j < 10; j++) {
                    if (length[j] >= i) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                    }
                    System.out.println("");
            }
            System.out.println("0123456789");
        }
    }
}
