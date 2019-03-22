package com.day03.dome003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/*十三、分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，
如果成绩一样，那在成绩排序的基础上按照年龄由小到大排序。
姓名（String）	年龄（int）	分数（float）
liusan	20	90.0F
lisi	22	90.0F
wangwu	20	99.0F
sunliu	22	100.0F
*/
public class Test13 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("刘三",20,90.0F));
        list.add(new Student("李四",22,90.0F));
        list.add(new Student("王五",20,99.0F));
        list.add(new Student("孙六",22,100.0F));
        Collections.sort(list);
        System.out.println(list);
        System.out.println(" =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore()==o2.getScore()){
                    return o1.getAge()-o2.getAge();
                }else {
                    return (int) (o2.getScore()-o1.getScore());
                }
            }
        });

        System.out.println(list);
    }
}
