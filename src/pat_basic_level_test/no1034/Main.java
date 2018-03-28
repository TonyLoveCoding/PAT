package pat_basic_level_test.no1034;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/28.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] table = new String[]{"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        while(in.hasNext()){
            String n = in.next();
            if(n.equals("0")){
                System.out.println(table[0]); continue;
            }
            char[] s = n.toCharArray();
            int sum = 0;
            for(char ch : s){
                sum += ch - '0';
            }
            ArrayList<String> list = new ArrayList<>();
            int temp;
            while(sum != 0){
                temp = sum % 10;
                list.add(table[temp]);
                sum /= 10;
            }
            for(int i = list.size() - 1; i >= 0; i--){
                System.out.print(i == list.size() - 1? list.get(i) : " " + list.get(i));
            }
            System.out.println();
        }
    }
}
