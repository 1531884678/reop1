package com.day05.dome05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 冯朋举
 * @date 2018/12/16 8:58
 */
public class Test1 {
    public static void main(String[] args) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

            try {
                Date date = format.parse("2018-04-03");
                System.out.println("程序正常");

            } catch (ParseException e) {
                System.out.println("程序异常");
            }

    }
}
