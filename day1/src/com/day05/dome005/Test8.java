package com.day05.dome005;

import com.day05.dome05.ScoreUnusualException;

/**
 * @author 冯朋举
 * @date 2018/12/16 18:17
 */
public class Test8 {
    public static void main(String[] args) {
        try {
            Student student = new Student("张三",1234,-123);
        } catch (ScoreUnusualException e) {
            e.printStackTrace();
        }
    }
}
