package com.day02.dome02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("....");
        c.add(".234.");
        c.add(".w.");
        c.add("..2.");
        Iterator<String> it = c.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
    }
}
