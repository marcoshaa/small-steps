package example;

import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class date {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x = new Date();//data e hora atual
		Date x1 = new Date(System.currentTimeMillis());
		Date x2 = new Date(0L);
		Date x3 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("30/08/2021");
		Date y2 = sdf2.parse("31/08/21 22:10:06");
		Date y3 = Date.from(Instant.parse("2021-08-31T21:34:05Z"));
		
		System.out.println("___________________________________");
		System.out.println(x);
		System.out.println(x1);
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("x: " + sdf2.format(x));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("___________________________________");
		System.out.println(x);
		System.out.println(x1);
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("x: " + sdf3.format(x));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("y3: " + sdf3.format(y3));
		
		
	}
}
