package Strings;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas {

	public static void main(String[] args) {
		
		Date date = new Date();
		long mili = date.getTime();
		System.out.println(date);
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2021);
		
		cal.set(2021, 1, 5, 13, 30, 0);
		
		Date d = cal.getTime();
		
		System.out.println(d);

		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		String f1 = df1.format(d);
		System.out.println(f1);
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String f2 = df2.format(d);
		System.out.println(f2);
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
		String f3 = df3.format(d);
		System.out.println(f3);
		
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG, new Locale("en", "US"));
		String f4 = df4.format(d);
		System.out.println(f4);
		
		SimpleDateFormat df5 = new SimpleDateFormat("yyyy-MM-dd");
		String f5 = df5.format(d);
		System.out.println(f5);
		
		
	}

}
