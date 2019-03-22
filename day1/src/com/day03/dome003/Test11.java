package com.day03.dome003;

import java.util.*;

/*十一、键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，必须保证顺序。
例如输入：aaaabbbcccddd，打印结果为：abcd。*/
public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        LinkedHashSet<Character> ha = new LinkedHashSet<>();
        char[] chars = next.toCharArray();
        Iterator<Character> iterator = ha.iterator();
        for (int i = 0; i < chars.length; i++) {
            ha.add(chars[i]);
        }
        System.out.print(ha);
    }
}
