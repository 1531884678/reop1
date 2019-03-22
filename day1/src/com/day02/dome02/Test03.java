package com.day02.dome02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(3,9);
        System.out.println(list);
        Integer remove = list.remove(3);
        System.out.println(remove);
        System.out.println(list);
        Integer remove1 = list.remove(0);
        System.out.println(remove1);
        System.out.println(list);
        list.set(2,8);
        System.out.println(list);
        Integer integer = list.get(1);
        System.out.println(integer);
        for (Integer integer1 : list) {
            System.out.println(integer1+"a");
        }
        Iterator<Integer> iterator = list.iterator();
        if (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
