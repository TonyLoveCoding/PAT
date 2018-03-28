package pat_basic_level_test.no1001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/22.
 */

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt() ;
            ArrayList<Peanut> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    int temp = in.nextInt();
                    if(temp > 0){
                        Peanut cur = new Peanut(i,j,temp);
                        list.add(cur);
                    }
                }
            }
            if(m == 0 || k == 0 || n == 0 || list.size() == 0){
                System.out.println("0");
                continue;
            }
            Collections.sort(list);
            int startCol = list.get(0).getY();
            list.add(0,new Peanut(-1, startCol, 0));
            int res = 0,step = 0, sub = 0;
            for(int i = 1; i < list.size(); i++){
                res += list.get(i).getValue();
                step += list.get(i).dis(list.get(i - 1));
                if(step + list.get(i).getY() > k){
                    res -= list.get(i).getValue();
                    break;
                }
            }
            System.out.println(res);
        }

    }
}
class Peanut implements Comparable<Peanut>{
    private int x;
    private int y;
    private int value;

    public int dis(Peanut p){
        return Math.abs(this.x - p.x) + Math.abs(this.y - p.y);
    }

    public Peanut(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Peanut p) {
        if(this.value > p.value){
            return -1;
        }
        else{
            return 1;
        }
    }
}