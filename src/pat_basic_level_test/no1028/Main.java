package pat_basic_level_test.no1028;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/25.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch;
        HashMap<Character, Integer> a,b;
        while (in.hasNext()){
            a = new HashMap<>(); b = new HashMap<>();
            String astring = in.next(), bstring = in.next();
            for(int i = 0; i < astring.length(); i++){
                ch = astring.charAt(i);
                if(a.containsKey(ch))
                    a.put(ch, a.get(ch) + 1);
                else
                    a.put(ch, 1);
            }
            for(int i = 0; i < bstring.length(); i++){
                ch = bstring.charAt(i);
                if(b.containsKey(ch))
                    b.put(ch, b.get(ch) + 1);
                else
                    b.put(ch, 1);
            }

            boolean res = true;
            for(Map.Entry<Character,Integer> m : b.entrySet()){
                char cur = m.getKey();
                if(a.containsKey(cur)){
                    if(a.get(cur) < m.getValue()){
                        res = false; break;
                    }
                }
                else{
                    res = false; break;
                }
            }
            System.out.println(res ? "Yes" : "No");
        }
    }
}
