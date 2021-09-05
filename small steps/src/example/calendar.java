package example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class calendar {

	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d =Date.from(Instant.parse("2021-09-03T15:42:09Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.HOUR_OF_DAY, 6);
		d = c.getTime();
		
		System.out.println(sdf.format(d));
		
		int min = c.get(Calendar.MINUTE);
		int mon = 1 + c.get(Calendar.MONTH);
		
		System.out.println("Minutes: "+min);
		System.out.println("Month: "+mon);
		
	}	
}