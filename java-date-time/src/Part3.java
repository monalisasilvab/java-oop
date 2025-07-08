import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Part3 {

	public static void main(String[] args) {
		
		LocalDate dt01 = LocalDate.parse("2024-05-24");
		LocalDateTime dt02 = LocalDateTime.parse("2024-05-24T14:52:48");
		Instant dt03 = Instant.parse("2024-05-24T14:52:48Z");
		
		LocalDate result01 = LocalDate.ofInstant(dt03, ZoneId.systemDefault());
		LocalDate result02 = LocalDate.ofInstant(dt03, ZoneId.of("Portugal"));
		LocalDateTime result03 = LocalDateTime.ofInstant(dt03, ZoneId.systemDefault());
		LocalDateTime result04 = LocalDateTime.ofInstant(dt03, ZoneId.of("Portugal"));
		
		System.out.println("result01 = " + result01);
		System.out.println("result02 = " + result02);
		System.out.println("result03 = " + result03);
		System.out.println("result04 = " + result04);
		System.out.println();
		
		System.out.println("dt01 day = " + dt01.getDayOfMonth());
		System.out.println("dt01 month = " + dt01.getMonthValue());
		System.out.println("dt01 year = " + dt01.getYear());
		System.out.println();
		
		System.out.println("dt02 hour = " + dt02.getHour());
		System.out.println("dt02 minute = " + dt02.getMinute());
		
	}

}
