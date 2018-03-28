package pat_basic_level_test.no1037;

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
            int count = 0, n = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>(), list2 = new ArrayList<>();
            for(int i = 0; i < n; i++){
                list.add(in.nextInt());
            }
            list2.addAll(list);
            for(int i : list2){
                int cur = i;
                while(cur != 1){
                    if(cur % 2 == 0){
                        cur = cur /2;
                    }
                    else{
                        cur = (3 * cur + 1) / 2;
                    }
                    if(list.contains(cur)){
                        list.remove((Integer)cur);
                    }
                }
             }
            Collections.sort(list);
            Collections.reverse(list);
            for(int i = 0; i < list.size(); i++){
                System.out.print(i == 0 ? list.get(i) : " " + list.get(i));
            }
            System.out.println();
        }
    }
}
