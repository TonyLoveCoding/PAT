package pat_basic_level_test.no1030;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/28.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String origin = in.nextLine();
            StringBuilder res = new StringBuilder();
            char cur ;
            for(int i = 0; i < origin.length(); i++){
                cur = origin.charAt(i);
                if(cur >= 'A' && cur <= 'Z'){
                    cur = cur > 'E'?(char)((int)cur-5) : (char)((int)cur + 21);
                }
                res.append(cur);
            }
            System.out.println(res.toString());
        }
    }
}
