package com.day02.dome002;

import java.util.ArrayList;

/*六、定义一个方法listTest(ArrayList<String> al),
 要求使用isEmpty()判断al里面是否有元素。*/
public class Test6 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("s");
        al.add("v");
        al.add("b");
        al.add("k");
        listTest(al);
    }

    public static void listTest(ArrayList<String> al) {

        boolean empty = al.isEmpty();
        if (empty==true){
            System.out.println("al里面没有元素");
        }else {
            System.out.println("al里面有元素");
        }
    }
}
