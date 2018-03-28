package pat_basic_level_test.no1036;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/28.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Student[] list = new Student[n];
        for(int i = 0; i < n; i++){
            String name = in.next(), num = in.next();
            int score =in.nextInt();
            list[i] = new Student(name,num,score);
        }
        Arrays.sort(list);
        System.out.println(list[n - 1]);
        System.out.println(list[0]);
    }
}
class Student implements Comparable<Student>{
    private String name;
    private String num;
    private int score;

    @Override
    public String toString() {
        return name + " " + num;
    }

    @Override
    public int compareTo(Student o) {
        if(this.score > o.getScore())
            return 1;
        if(this.score < o.getScore())
            return -1;
        return 0;
    }

    public Student(String name, String num, int score) {
        this.name = name;
        this.num = num;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}