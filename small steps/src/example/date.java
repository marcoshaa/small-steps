package example;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class date {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("DD/MM/YYYY");
		SimpleDateFormat sdf2 = new SimpleDateFormat("DD/MM/YYYY HH:mm:ss");
		
		Date x = new Date();
		Date x1 = new Date(System.currentTimeMillis());
		
		Date y1 = sdf1.parse("30/08/2021");
		Date y2 = sdf2.parse("31/08/21 22:10:06");
		
		
		System.out.println(x);
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(y2);
	}
}
