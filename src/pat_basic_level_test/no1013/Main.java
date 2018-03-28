package pat_basic_level_test.no1013;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/24.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] primes = new int[100000];
        primes[0] = 2; primes[1] = 3;
        int index = 2;
        for(int i = 4; i < 1000000; i++){
            if(isPrime(i)){
                primes[index++] = i;
            }
        }
        while(in.hasNext()){
            int m = in.nextInt(), cur = 0;
            int n = m;
            ArrayList<Integer> list = new ArrayList<>();
            while(n > 1){
                if(n % primes[cur] == 0){
                    list.add(primes[cur]);
                    n /= primes[cur];
                }
                else{
                    cur ++;
                }
            }
            System.out.print(m + " = ");
            for(int i = 0; i < list.size(); i++){
                System.out.print((i == 0? list.get(i) : " * " + list.get(i)));
            }
            System.out.println();
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
