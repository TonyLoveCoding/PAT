package pat_basic_level_test.no1040;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/28.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int n = in.nextInt(), m = in.nextInt();
            int[] a = new int[n];
            m = m % n;
            for(int i = 0; i < n; i++){
                if(i + m < n){
                    a[i + m] = in.nextInt();
                }
                else {
                    a[i + m - n] = in.nextInt();
                }
            }
            for(int i = 0; i < n; i++)
                System.out.print(i == 0 ? a[i] : " " + a[i]);
            System.out.println();
        }
    }
}
