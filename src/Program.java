import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-06-25");
		LocalDateTime d05 = LocalDateTime.parse("2023-06-25T15:03:33");
		Instant d06 = Instant.parse("2023-06-25T15:03:33Z");
		Instant d07 = Instant.parse("2023-06-25T15:03:33-03:00");
		
		System.out.println("d01 = "+ d01);
		System.out.println("d02 = "+ d02);
		System.out.println("d03 = "+ d03);
		System.out.println("d04 = "+ d04);
		System.out.println("d05 = "+ d05);
		System.out.println("d06 = "+ d06);
		System.out.println("d07 = "+ d07);
		
		System.out.println("---------------------------------");	
		
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		LocalDate d08 = LocalDate.parse("25/06/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("25/06/2023 15:03", fmt2);
		
		System.out.println("d08 = "+ d08);
		System.out.println("d09 = "+ d09);
		
		System.out.println("---------------------------------");
		
		LocalDate d10 = LocalDate.of(2023, 06, 25);		
		LocalDateTime d11 = LocalDateTime.of(2023,06,25, 15,30);
		
		System.out.println("d10 = "+ d10);
		System.out.println("d11 = "+ d11);
		
		System.out.println("--------------formater-------------------");
		
		System.out.println("d04 = "+ d04.format(fmt1));
		System.out.println("d04 = "+ fmt1.format(d04));
		System.out.println("d05 = "+ fmt1.format(d05));
		System.out.println("d05 = "+ fmt2.format(d05));		
		System.out.println("d05 = "+ fmt2.format(d05));
		System.out.println("d05 = "+ fmt4.format(d05));
		System.out.println("d06 = "+ fmt3.format(d06));
		System.out.println("d06 = "+ fmt5.format(d06));
		
		
		System.out.println("--------------Convertendo datas-------------------");
		
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r1 = "+ r1);
		System.out.println("r2 = "+ r2);
		
		System.out.println("r3 = "+ r3);
		System.out.println("r4 = "+ r4);
		
		
		
		System.out.println("-------------GET----------------");
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mes = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minute = " + d05.getMinute());
		
		System.out.println("------------Calculos----------------");
		
		
		LocalDate pastWeek = d04.minusDays(7);
		LocalDate nextWeek = d04.plusDays(7);
		
		System.out.println("pastWeek = " +pastWeek);
		System.out.println("nextWeek = " +nextWeek);
		
		
		Instant pastWeekI = d06.minus(7, ChronoUnit.DAYS);
		System.out.println("pastWeekI = " +pastWeekI);
		
		Instant nextWeekI = d06.plus(7, ChronoUnit.DAYS);
		System.out.println("nextWeekI = " +pastWeekI);
		
		
		Duration t1 = Duration.between(pastWeekI, nextWeekI);
		System.out.println("t1 = " +t1.toDays());
 		
		
	}
}
