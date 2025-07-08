import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Part1 {

	public static void main(String[] args) {
		
		DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter form2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		LocalDate dt01 = LocalDate.now();		
		LocalDateTime dt02 = LocalDateTime.now();	
		Instant dt03 = Instant.now();	
		LocalDate dt04 = LocalDate.parse("2024-05-22");		
		LocalDateTime dt05 = LocalDateTime.parse("2024-05-22T09:59:02");		
		Instant dt06 = Instant.parse("2024-05-22T09:59:02Z");		
		Instant dt07 = Instant.parse("2024-05-22T09:59:02-03:00");		
		LocalDate dt08 = LocalDate.parse("22/05/2024", form1);
		LocalDateTime dt09 = LocalDateTime.parse("22/05/2024 09:59", form2);
		LocalDate dt10 = LocalDate.of(2024, 05, 22);
		LocalDateTime dt11 = LocalDateTime.of(2024, 05, 22, 9, 59);
		
		
		System.out.println("dt01 = " + dt01.toString());
		System.out.println("dt02 = " + dt02.toString());
		System.out.println("dt03 = " + dt03.toString());
		System.out.println();
		System.out.println("dt04 = " + dt04.toString());
		System.out.println("dt05 = " + dt05.toString());
		System.out.println("dt06 = " + dt06.toString());
		System.out.println("dt07 = " + dt07.toString());
		System.out.println();
		System.out.println("dt08 = " + dt08.toString());
		System.out.println("dt09 = " + dt09.toString());
		System.out.println();
		System.out.println("dt10 = " + dt10.toString());
		System.out.println("dt11 = " + dt11.toString());

	}

}
