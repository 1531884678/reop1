package com.day03.dome003;
/*六、定义人类，包含姓名和年龄属性。
创建4个人存储到HashSet中，姓名和年龄相同的人看做同一人不存储。*/
import java.util.HashSet;

public class Test6 {
    public static void main(String[] args) {
        HashSet<Person> ha=new HashSet<>();
        ha.add(new Person("张三",20));
        ha.add(new Person("张三",20));
        ha.add(new Person("王二",34));
        ha.add(new Person("李氏",23));
        System.out.println(ha);
    }
}
