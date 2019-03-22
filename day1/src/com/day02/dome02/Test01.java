package com.day02.dome02;

import java.util.ArrayList;

public class Test01<E> {
    private ArrayList<E> list = new ArrayList<E>();

    public void in(E e) {
        list.add(e);
    }

    public E im() {
        if (list.size() == 0) {
            return null;
        }
        return list.remove(0);
    }
}
