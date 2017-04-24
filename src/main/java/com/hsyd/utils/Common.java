package com.hsyd.utils;

import java.sql.Timestamp;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : sunwei
 *         Date : 2017/4/19
 *         Time : 17:05
 */
public class Common {

    /**
     * @param dateStr       日期字符串
     * @param curPattern    日期对象当前格式
     * @param targetPattern 日期转换后目标格式
     * @return 指定格式的字符串
     */
    public static String parseDate(String dateStr, String curPattern, String targetPattern) {
        if (dateStr == null || dateStr.equals("")) {

            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(curPattern);
        Date date = null;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new SimpleDateFormat(targetPattern).format(date);
    }


    /**
     * 获取订单流水号
     * @return
     */
    public String getOrderId(){

        Format format = new SimpleDateFormat("yyyyMMdd");
        String time = format.format(new Date());
        int num = (int)((Math.random()*9+1)*100000);
        String orderId = "" + time + num;

        return orderId;
    }

    /**
     * 获取当前时间
     * @return
     */
    public Timestamp  getNowTime_tamp(){
        //获取当前时间
        Date now = new Date();
        Long tim = now.getTime();
        Timestamp time = new Timestamp(tim);
        return time;
    }
}
