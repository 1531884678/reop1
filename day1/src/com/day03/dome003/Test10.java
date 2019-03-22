package com.day03.dome003;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/*十、已知数组存放一批QQ号码，QQ号码最长为11位，
最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，
将list中所有元素分别用迭代器和增强for循环打印出来
*/
public class Test10 {
    public static void main(String[] args) {
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < strs.length; i++) {
            list.add(strs[i]);
        }
        HashSet<String> ha = new HashSet<>();
        for (String s : list) {
            ha.add(s);
        }
        System.out.println(ha);
        Iterator<String> iterator = ha.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("---------------");
        for (String s : ha) {
            System.out.println(s);
        }
    }
}
