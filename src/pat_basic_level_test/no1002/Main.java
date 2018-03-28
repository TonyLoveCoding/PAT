package pat_basic_level_test.no1002;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/23.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int n = in.nextInt();

            if(n == 0 || n == 1) {
                System.out.println("No");
                continue;
            }
            if((n - 2) % 4 == 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

        }
    }
