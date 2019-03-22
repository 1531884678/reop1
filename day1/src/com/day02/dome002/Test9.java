package com.day02.dome002;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*九、(复杂，并不难)定义一个学生类Student，包含三个属性姓名、年龄、性别，
创建三个学生对象存入ArrayList集合中。
A：遍历集合遍历输出。
B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇
*/
public class Test9 {
    public static void main(String[] args) {
        ArrayList<Stident> list = new ArrayList<>();
        Stident st1 = new Stident("李氏", 15, "男");
        Stident st2 = new Stident("王二", 18, "男");
        Stident st3 = new Stident("红巨", 19, "女");
        list.add(st1);
        list.add(st2);
        list.add(st3);
        System.out.println(list);
        System.out.println("----------------");
        System.out.println(getList(list));
    }

    private static ArrayList<Stident> getList(ArrayList<Stident> list) {
        int a = list.get(0).getAge(), count = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getAge() > a) {
                a = list.get(i).getAge();
                count = i;
            }
        }
        list.get(count).setName("小猪佩奇");
        return list;
    }

}
