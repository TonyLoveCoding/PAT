package pat_basic_level_test.no1042;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/28.
 */
public class Main {
//    辣鸡题
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean start = true;
        while(in.hasNext()){
            int x = in.nextInt(), n = in.nextInt();

            if(x == -2 && n == 0 && start){
                System.out.print("0 0");
                continue;
            }

            if(x == 0 && n == 0){
                if(start){
                    System.out.print("0 0");
                    start = false; continue;
                }
                else{
                    System.out.print(" 0 0"); continue;
                }
            }
            else if(n == 0 && x != 0){
                continue;
            }
            else{
                if(start){
                    System.out.print(x * n);
                    start = false;
                }
                else{
                    System.out.print(" " + (x * n));
                }
                System.out.print(" " + (n - 1));
            }

        }
    }
}
