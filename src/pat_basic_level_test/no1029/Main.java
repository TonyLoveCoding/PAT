package pat_basic_level_test.no1029;

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scann=new Scanner(System.in);
        while(scann.hasNext()){
            int year=scann.nextInt();
            if(year==2000){
                System.out.println(10);
                continue;
            }else{
                ArrayList<Integer> list=day(year);
                if(list.size()==0){
                    System.out.println("Luck");
                }else{
                    System.out.print(list.get(0));
                    for(int i=1;i<list.size();i++){
                        System.out.print(" "+list.get(i));
                    }
                    System.out.println();
                }
            }
        }
    }
    
            //计算某年第一个13号是星期几
    public static int firstDay(int year){
        int count=5;//2001年的1月13号星期6，由于对7求余是0到6，所以为5
        for(int i=2001;i<year;i++){
            if((i%4==0) && (i%100!=0)||(i%400==0)){//上一年是闰年，366%7=2
                count=(count+2)%7;
            }else{
                count=(count+1)%7;//上一年为平年，365%7=1
            }
        }
        return count;
    }
    
            //计算一年有哪些月满足条件
            public static ArrayList<Integer> day(int year){
        ArrayList<Integer> list=new ArrayList<Integer>();
        int n=firstDay(year);
        if(n==4){
            list.add(1);
        }
        for(int i=1;i<12;i++){
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10){
                n=(n+3)%7;
            }else if(i==4 || i==6 || i==9 || i==11){
                n=(n+2)%7;
            }else if((year%4==0&&year%100!=0)||(year%400==0)){
                n=(n+1)%7;
            }
            if(n==4){
                list.add(i+1);
            } 
        }
        return list;
    }
}