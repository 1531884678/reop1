package com.day02.dome002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*三、定义一个方法，要求此方法把int数组转成存有相同元素的集合
(集合里面的元素是Integer)，并返回*/
public class Test3 {
    public static void main(String[] args) {
        int[] arr={12,33,432,534,6,45,74,5,7,67,8,78};
        Collection<Integer> list = getList(arr);
        System.out.println(list);
    }
    public static Collection<Integer> getList(int[] arr){
        Collection<Integer> c=new ArrayList<>();
        for (int i : arr) {
            c.add(i);
        }
        return c;
    }
}
