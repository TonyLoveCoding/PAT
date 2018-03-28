package pat_basic_level_test.no1038;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/28.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String n = in.next();
            ArrayList<Integer> list = new ArrayList<>();
            for(char ch : n.toCharArray()){
                list.add(ch - '0');
            }
            Collections.reverse(list);
            StringBuilder res = new StringBuilder();
            int len = list.size();
            for(int i = len - 1; i >= 0; i--){
                for(int j = 0;j < list.get(i); j++){
                    if(i == 2){
                        res.append("B");
                    }
                    else if(i == 1){
                        res.append("S");
                    }
                    else{
                        res.append(j + 1);
                    }
                }
            }
            System.out.println(res.toString());
        }
    }
}
