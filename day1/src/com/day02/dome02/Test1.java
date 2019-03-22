package com.day02.dome02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> arr = new ArrayList<String>();
        arr.add("鼓楼大街");
        arr.add("公主坟");
        arr.add("什刹海");
        arr.add("育新");
        Iterator<String> it = arr.iterator();
        it.next();
        while (it.hasNext()) {
            String str = it.next();
            System.out.print(str + " ");
        }
    }
}
