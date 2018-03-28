package pat_basic_level_test.no1019;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/25.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sym = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while(in.hasNext()){
            int m = in.nextInt();
            boolean finalRes = false;
            for(int r = 2; r <= 16; r++){
                int n = m;
                StringBuilder res = new StringBuilder();
                while(n > 0){
                    if(n % r > 9){
                        res.append(sym.charAt((n % r) - 10));
                    }
                    else{
                        res.append(n % r);
                    }
                    n /= r;
                }
                if(isReverse(res)){
                    finalRes = true;
                    break;
                }
            }
            System.out.println(finalRes ? "Yes" : "No");
        }
    }

    private static boolean isReverse(StringBuilder sb){
        return sb.toString().equals(sb.reverse().toString());
    }
}
