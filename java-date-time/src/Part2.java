import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Part2 {

	public static void main(String[] args) {
		
		LocalDate dt01 = LocalDate.parse("2024-05-24");
		LocalDateTime dt02 = LocalDateTime.parse("2024-05-24T14:25:08");
		Instant dt03 = Instant.parse("2024-05-24T14:25:08Z");
		
		DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter form2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter form3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter form4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter form5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("dt01 = " + dt01.format(form1));
		System.out.println("dt01 = " + form1.format(dt01));
		System.out.println("dt01 = " + dt01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println();
		
		System.out.println("dt02 = " + dt02.format(form1));
		System.out.println("dt02 = " + dt02.format(form2));
		System.out.println("dt02 = " + dt02.format(form4));
		System.out.println();
		
		System.out.println("dt03 = " + form3.format(dt03));
		System.out.println("dt03 = " + form5.format(dt03));
		System.out.println("dt03 = " + dt03.toString());
		
	}

}
