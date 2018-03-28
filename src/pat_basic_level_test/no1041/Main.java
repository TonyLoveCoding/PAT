package pat_basic_level_test.no1041;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/28.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String n = in.nextLine();
        String[] res = n.split(" ");
        for(String s : res) list.add(s);
        Collections.reverse(list);
        for(int i = 0; i < list.size() - 1; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list.get(list.size() - 1));
    }
}
