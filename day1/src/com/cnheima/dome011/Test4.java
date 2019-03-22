package com.cnheima.dome011;

import java.util.Arrays;

/*八、现有一个字符数组{'i','t','c','a','s','a'}，
请使用System类中的arraycopy()方法在控制台输出“itcast”。
（提示：将[1]号数组元素复制到最后位置并覆盖原有元素。）*/
public class Test4 {
    public static void main(String[] args) {
        char[] str = {'i', 't', 'c', 'a', 's', 'a'};
        System.arraycopy(str, 1, str, str.length - 1, 1);
        System.out.println(str);
        System.out.println(Arrays.toString(str));
    }
}
