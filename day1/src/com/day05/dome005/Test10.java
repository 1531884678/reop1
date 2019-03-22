package com.day05.dome005;

/**
 * @author 冯朋举
 * @date 2018/12/16 18:31
 */
public class Test10 {
    public static void main(String[] args) {
        try {
            Play play = new Play("宫本武藏",-1);
        } catch (HealthPointException e) {
            e.printStackTrace();
        }
    }
}
