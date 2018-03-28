package pat_basic_level_test.no1011;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/24.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean res[] = new boolean[100];
        for(int i = 0; i < 100; i++){
            int temp = i - 39, sum = temp * temp + temp + 41;
            res[i] = isPrime(sum)? true:false;
        }
        while(in.hasNext()){
            int a = in.nextInt(), b = in.nextInt();
            if(a == 0 && b == 0){
                break;
            }
            a += 39; b += 39;
            boolean isResult = true;
            for(int i = a; i <= b; i++){
                if(!res[i]){
                    isResult = false;
                }
            }
            System.out.println((isResult ? "OK" : "Sorry"));
        }
    }


    //百分百正确的判断素数方法！！！！！！！！！！！
    private static boolean isPrime(int n){
        if(n < 2) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(int i = 3; i * i <= n; i+=2){
            if(n%i == 0) return false;
        }
        return true;
    }
}
