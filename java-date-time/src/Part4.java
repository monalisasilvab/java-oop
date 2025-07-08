import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Part4 {

	public static void main(String[] args) {
		
		LocalDate dt01 = LocalDate.parse("2024-05-24");
		LocalDateTime dt02 = LocalDateTime.parse("2024-05-24T14:52:48");
		Instant dt03 = Instant.parse("2024-05-24T14:52:48Z");
		
		LocalDate pastWeekLD = dt01.minusDays(7);
		LocalDate nextWeekLD = dt01.plusDays(7);
		
		System.out.println("pastWeekLD = " + pastWeekLD);
		System.out.println("nextWeekLD = " + nextWeekLD);
		System.out.println();
		
		LocalDateTime pastWeekLDT = dt02.minusDays(7);
		LocalDateTime nextWeekLDT = dt02.plusDays(7);
		
		System.out.println("pastWeekLDT = " + pastWeekLDT);
		System.out.println("nextWeekLDT = " + nextWeekLDT);
		System.out.println();
		
		Instant pastWeekInst = dt03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInst = dt03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInst = " + pastWeekInst);
		System.out.println("nextWeekInst = " + nextWeekInst);
		System.out.println();
		
		Duration time01 = Duration.between(pastWeekLD.atStartOfDay(), dt01.atStartOfDay());
		Duration time02 = Duration.between(pastWeekLDT, dt02); 
		Duration time03 = Duration.between(pastWeekInst, dt03);
		Duration time04 = Duration.between(dt03, pastWeekInst);
		
		System.out.println("time 01 days = " + time01.toDays());
		System.out.println("time 02 days = " + time02.toDays());
		System.out.println("time 03 days = " + time03.toDays());
		System.out.println("time 04 days = " + time04.toDays());
		
	}

}
