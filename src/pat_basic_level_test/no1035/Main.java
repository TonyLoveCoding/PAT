package pat_basic_level_test.no1035;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Tony Yao on 2018/3/28.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n -- > 0){
            String str = in.next();
            System.out.println(get(str)?"YES" : "NO");
        }
    }
    private static boolean get(String line){
        if(line == null) return false;
        String regex="[^PAT]";
        Matcher m=Pattern.compile(regex).matcher(line);
        if(m.matches()) return false;

        int i=0, len = line.length(),pCount,aCount,tCount;
        pCount=aCount=tCount=0;
         
        for(i=0;i<len;++i){
            if(line.charAt(i)=='P'){
                ++pCount;
            }else if(line.charAt(i)=='A'){
                ++aCount;
            }else if(line.charAt(i)=='T'){
                ++tCount;
            }else{
                // 不满足条件1: 字符串中必须仅有P, A, T这三种字符，不可以包含其它字符
                return false;
            }
        }
         
        // P和T只能出现一次 ，且A的个数大于一次
        if(!(pCount==tCount && aCount>=1 && pCount==1 ))
            return false;
         
        int indexP = line.indexOf('P');
        int indexT = line.indexOf('T');
         
        int leftA = indexP; // P前面A的个数
        int rightA = len - indexT - 1; // T后面A的个数
        int middleA = indexT - indexP - 1; // P和T直间A的个数
         
        int n = middleA - 1; // 迭代次数
        if(rightA != n * leftA + leftA)
            return false;
         
        return true;
    }
}
