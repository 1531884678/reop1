package com.day03.dome003;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*八、使用LinkedHashSet存储以下元素："王昭君","王昭君","西施","杨玉环","貂蝉"
使用迭代器和增强for循环遍历LinkedHashSet。*/
public class Test8 {
    public static void main(String[] args) {
        LinkedHashSet<String> lin=new LinkedHashSet<>();
        Collections.addAll(lin,"王昭君","王昭君","西施","杨玉环","貂蝉");
        Iterator<String> it = lin.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
        System.out.println(" ==========");
        for (String s : lin) {
            System.out.println(s);
        }
    }
}
