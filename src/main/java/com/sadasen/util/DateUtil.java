package com.sadasen.util;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date 2018年3月23日
 * @author lei.ys
 * @addr company
 * @desc
 */
public class DateUtil implements Serializable {

	private static final long serialVersionUID = 4993649327105179257L;
	
	private DateUtil() {
	}
	
	/**
	 * 字符串按格式转化为时间
	 * @param string
	 * @param format
	 * @return
	 * @throws ParseException 
	 */
	public static Date stringToDateFormat(String string, String format) throws ParseException {
		DateFormat df = new SimpleDateFormat(format);
		Date dt = df.parse(string);
		return dt;
	}
	
	/**
	 * 时间转换为指定的字符串
	 * @param date
	 * @param format
	 * @return
	 */
	public static String dateToStringFormat(Date date, String format) {
		DateFormat df = new SimpleDateFormat(format);
		String string = df.format(date);
		return string;
	}
	
	public static String getDateString(Date date) {
		return dateToStringFormat(date, "yyyy-MM-dd");
	}
	
	public static boolean isSameDay(Date d1, Date d2) {
        String s1 = DateUtil.getDateString(d1);
        String s2 = DateUtil.getDateString(d2);
        if(s1.equals(s2)) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) throws ParseException {
		Date d1 = stringToDateFormat("2018-03-01 23:59:59", "yyyy-MM-dd HH:mm:ss");
		Date d2 = stringToDateFormat("2018-03-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
		boolean d = isSameDay(d1, d2);
		System.out.println(d);
	}

}
