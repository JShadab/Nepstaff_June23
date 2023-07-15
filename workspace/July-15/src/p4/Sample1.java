package p4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Sample1 {
	public static void main(String[] args) {

		Date date1 = new Date();
		System.out.println(date1);

		Calendar calendar = Calendar.getInstance();
		Date date2 = calendar.getTime();
		System.out.println(date2);

		LocalDate localDate = LocalDate.now();
		System.out.println("Date in India is : " + localDate);

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("DateTime in India is : " + localDateTime);

		//ZoneId.getAvailableZoneIds().forEach(System.out :: println);

		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/Chicago"));
		System.out.println("DateTime in USA is : " + zonedDateTime);
	}

}
