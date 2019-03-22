package com.day05.dome05;

/**
 * @author 冯朋举
 * @date 2018/12/16 15:28
 */
public class Test3 {
    public static void main(String[] args) {
        try {
            Person person=new Person();
            person.setAge(1000);
        } catch (AgeOutBoundsException e) {
            e.printStackTrace();
        }
    }
}
