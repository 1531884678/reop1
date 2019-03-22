package com.day02.dome002;

import java.util.ArrayList;

/*五、定义一个方法listTest(ArrayList<String> al, String s),
要求使用contains()方法判断al集合里面是否包含s。*/
public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("s");
        al.add("v");
        al.add("b");
        al.add("k");
        System.out.println(listTest(al, "s"));
    }

    public static boolean listTest(ArrayList<String> al, String s) {
        for (String s1 : al) {
            if (s.contains(s1)){
                return true;
            }
        }
        return false;
    }
}
