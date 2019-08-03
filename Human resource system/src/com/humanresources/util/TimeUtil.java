package com.humanresources.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
	public Date getTime() {
		String dateString = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public String getTimestr() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}
	public Date nowTime() {
		String dateString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		try {
			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
