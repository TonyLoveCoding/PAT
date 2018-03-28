package Utils;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/29.
 */
public class Bag {

    public static void main(String[] args) {
        int n,m, max = 10000;
        int[] v,w,dp;
        Scanner in = new Scanner(System.in);
        n = in.nextInt(); m = in.nextInt();
        w = new int[n + 1]; v = new int[n + 1]; dp = new int[m + 1];
        for(int i = 1; i <= n; i++){
            w[i] = in.nextInt();
            v[i] = in.nextInt();
        }
        for(int i = 1; i <= n; i++){
            for(int j = w[i]; j <= m; j++){
                if(j >= w[i])
                    dp[j]=Math.max(dp[j],dp[j-w[i]]+v[i]);
            }
        }
        for(int i : dp) System.out.print(i + " ");
        System.out.println();
        System.out.println(dp[m]);
    }
}
