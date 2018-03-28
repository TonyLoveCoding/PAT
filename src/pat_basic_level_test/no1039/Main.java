package pat_basic_level_test.no1039;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/28.
 */
public class Main {
    private int max = 100000;
    int[] su = new int[max];
    int cnt;
    boolean[] isprime = new boolean[max];

    private void prime(){
        cnt = 0;
        for(int i =0; i < max; i++) isprime[i] = true;
        isprime[0] = false; isprime[1] = false;
        for(int i = 0; i < max; i++){
            if(isprime[i]) su[cnt++] = i;
            for(int j = 1; j < cnt && su[j] * i < max; j++){
                isprime[su[j] * i] = false;
            }
        }
    }

    public int get(int n){
        int res = 0;
        for(int i = 1; i < cnt; i++){
            if(n < su[i]){
                break;
            }
            if(su[i] - su[i - 1] == 2){
                res ++;
            }
        }
        return res + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main t = new Main();
        t.prime();
        while(in.hasNext()){
            int n = in.nextInt();
            if(n == 1){
                System.out.println("0"); continue;
            }
            System.out.println(t.get(n));
        }
    }
}
