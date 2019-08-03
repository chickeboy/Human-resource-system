package com.humanresources.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.core.convert.converter.Converter;

public class MyDateConverter implements Converter<String, Date>{
	SimpleDateFormat[] formats=new SimpleDateFormat[]{
			new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"),
			new SimpleDateFormat("yyyy-MM-dd HH"),
			new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH)
	};
	@Override
	public Date convert(String source) {
		for(SimpleDateFormat format:formats){
			try {
				//字符串转日期
				Date date=format.parse(source);
				return date;
			} catch (ParseException e) {
			}
		}
		return null;
	}

}