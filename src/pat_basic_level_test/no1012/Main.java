package pat_basic_level_test.no1012;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/24.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] a = new int[3][2];
        while(in.hasNext()){
            String[] a1 = in.next().split("/"), a2 = in.next().split("/");
            int d;
            char sym = in.next().charAt(0);
            a[0][0] = Integer.parseInt(a1[0]); a[0][1] = Integer.parseInt(a1[1]);
            a[1][0] = Integer.parseInt(a2[0]); a[1][1] = Integer.parseInt(a2[1]);

            if(sym == '+' || sym == '-'){

                d = a[0][1] * a[1][1] / gcd(a[0][1],a[1][1]);
                a[0][0] *= d / a[0][1]; a[0][1] = d;
                a[1][0] *= d / a[1][1]; a[1][1] = d;

                if(sym == '+') {
                    a[2][0] = a[0][0] + a[1][0];
                    a[2][1] = a[0][1];
                }
                else {
                    a[2][0] = a[0][0] - a[1][0];
                    a[2][1] = a[0][1];
                }
            }
            else if(sym == '*' || sym == '/'){
                if(a[0][0] < 0 && a[1][0] < 0){
                    a[0][0] = -a[0][0]; a[1][0] = -a[1][0];
                }
                if(sym == '/'){
                    int temp = a[1][1];
                    a[1][1] = a[1][0];
                    a[1][0] = temp;
                }

                a[2][0] = a[0][0] * a[1][0];
                a[2][1] = a[0][1] * a[1][1];
            }
            d = gcd(a[2][0], a[2][1]);
            if(d < 0){
                d = - d;
            }
            a[2][0] /= d; a[2][1] /= d;
            System.out.println(a[2][0] + "/" + a[2][1]);
        }
    }

    private static int gcd(int a, int b){
        int c = b;
        while(a%b != 0){
            c = a%b;
            a = b;
            b = c;
        }
        return c;
    }
}
