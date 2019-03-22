package com.day02.dome002;

import java.util.ArrayList;
import java.util.Collection;

/*四、定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，
并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）*/
public class Test4 {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.add(6);
        c.add(7);
        Object[] array = c.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
