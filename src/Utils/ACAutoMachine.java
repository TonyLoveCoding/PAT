package Utils;

import java.util.Scanner;

/**
 * Created by Tony Yao on 2018/3/25.
 */
public class ACAutoMachine {
    static Node root ;
    static int head, tail, cnt;
    static Node[] q;
    public static void Insert(String str){
        Node p = root;
        for(int i = 0; i < str.length(); i ++){
            int x = str.charAt(i) - 'a';
            if(p.next[x] == null){
                p.next[x] = new Node(0);
            }
            p = p.next[x];
        }
        p.sum++;
    }

    public static void Build_Fail_Pointer(){
        head = 0;  tail = 1;
        q = new Node[1000];
        q[head] = root;
        Node p, temp;

        while(head < tail){
            temp = q[head++];
            for(int i = 0; i < 26; i++){
                if(temp.next[i] != null){
                    if(temp == root){
                        temp.next[i].fail = root;
                    }
                    else{
                        p = temp.fail;
                        while(p != null){
                            if(p.next[i] != null){
                                temp.next[i].fail = p.next[i];
                                break;
                            }
                            p = p.fail;
                        }
                        if(p == null) temp.next[i].fail = root;
                    }
                    q[tail++] = temp.next[i];
                }
            }
        }
    }

    public static void AC_Automation(String str){
        Node p = root;
        int len = str.length();
        for(int i = 0; i < len ;i++){
            int x = str.charAt(i) - 'a';
            while(p.next[x] == null && p != root) p = p.fail;
            p = p.next[x];
            if(p == null) p = root;
            Node temp = p;
            while(temp != root){
                if(temp.sum >= 0){
                    cnt += temp.sum;
                    temp.sum = -1;
                }
                else break;
                temp = temp.fail;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        root = new Node(0);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String str = in.next();
            Insert(str);
        }
        System.out.println("input the pattern");
        String target = in.next();
        cnt = 0;
        Build_Fail_Pointer();
        AC_Automation(target);
        System.out.println(cnt);
    }
}

class Node{
    int sum;
    Node[] next;
    Node fail;

    public Node(int sum) {
        this.sum = sum;
        next = new Node[26];
        fail = null;
    }
}