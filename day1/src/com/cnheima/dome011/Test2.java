package com.cnheima.dome011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*六、使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。*/
public class Test2 {
    public static void main(String[] args) throws ParseException {
        String str="2018-03-04";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date pa = sdf.parse(str);
        long time = pa.getTime();
        pa.setTime(time);
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(sdf1.format(pa));
    }
}
