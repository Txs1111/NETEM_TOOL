package com.NETEM.Tool;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 2021年7月12日17:08:29
 *
 * @author Lyon
 */
public class Time {
    /**
     * 生成数据库格式时间
     *
     * @return
     */
    public static String getString() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = simpleDateFormat.format(date);
        return time;
    }

    /**
     * 时间戳转换成日期格式字符串
     *
     * @return
     */
    public static String TimeMillisToString(long timeMillis) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = simpleDateFormat.format(timeMillis);
        return time;
    }
}
