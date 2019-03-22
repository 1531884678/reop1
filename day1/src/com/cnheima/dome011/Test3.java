package com.cnheima.dome011;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*七、用程序判断2018年2月14日是星期几*/
public class Test3 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.set(2018,1,14);
        System.out.println(c.get(Calendar.DAY_OF_WEEK)-1);
    }
}
