package ejercicio1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Ejercicio1 {
/*
	 1. Presenta fecha actual
	 2. Presentar fecha y hora actual
	 3. Presentar fecha y hora en Europa/Madrid
	 4. Presentar fecha del 10/12/2022 con este formato
	 5. Indicar a que mes corresponde el 7/12/2020, en numero y el nombre
	 6. Comprobar si el a�o 2022 es bisiesto
	 7. Comprobar si puedo poner el dia 29 a 2/2020
	 8. Ver que fecha es 30 d�as despu�s del 20/2/2010
	 9. Ver que fecha es 1 mes despu�s del 15/12/2009
	10. Calcular cuantos d�as han pasado entre el 7/10/2001 y el 10/5/2004
	11. Calcular cuantos meses han pasado entre el 7/10/2001 y el 10/5/2004
	12. Calcular cuantos a�os han pasado entre el 7/10/2001 y el 10/5/2004
	13. Calcular cuantas horas han pasado entre el 7/10/2001 y el 10/5/2004
	14. Calcular el periodo que existe entre 3/2/2020 y el 5/7/2021
	15. Ver que fecha sale si sumamos el periodo anterior a la fecha 12/11/2022
	16. Ver que d�a de la semana era el 22/4/2022
	17. Ver que d�a de la semana era hace tres d�as
	18. Indicar el nombre en castellano del mes actual
	19. Ver que d�a de la semana era el primer d�a del mes de octubre de 1940
	20. Presentar la fecha correspondiente al d�a 253 del a�o 1989
	21. Cuantos segundos han pasado desde las 10:15 hasta las 12:30
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDate fecha = LocalDate.now();       // System.out.printf("Fecha actual :" , localDate.now();            SE PUEDE DECLARAR LAAS VARIABLES O HACERLO DIRECTAMENTE ASI
		System.out.println(fecha);
		
		LocalTime hora = LocalTime.now();
		System.out.println(hora); 
		
		System.out.printf("Fecha actual : %s%n" , LocalDateTime.now().atZone(ZoneId.of("Europe/Madrid"))); 
		System.out.printf("Fecha actual : %s%n" , LocalDateTime.now(ZoneId.of("Europe/London"))); 
		
		
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");           	//System.out.printf("%s%n" , LocalDate.of(2022,12,10.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		String fecha10 = "10-12-2022";
		
		LocalDate fecha11 = LocalDate.from(fmt2.parse(fecha10));
		System.out.printf("%s%n", fecha10);
		
	
		LocalDate fecha5 = LocalDate.of(2020, 12, 7);
		System.out.printf("Numero: %d Nombre: %s%n" , fecha5.getMonthValue(), fecha5.getMonth().getDisplayName(TextStyle.FULL , Locale.getDefault()));
		
		
		/////
        LocalDate fecha2 = LocalDate.of(2020, Month.FEBRUARY, 29);	
		System.out.println(fecha2);
		Year year1 = Year.of(2022);
		System.out.println(year1);		
		System.out.println("Es bisiesto el año 2022: " + year1.isLeap());
		
		/////
		YearMonth fecha7 = YearMonth.of(2020, 2);
		System.out.printf("%s%n",  fecha7.isValidDay(29));
		
		LocalDate fecha3 = LocalDate.of(2010, Month.FEBRUARY, 20);	
		System.out.println("La fecha dentro de 30 días: " + fecha3.plusDays(30) );
		
		LocalDate fecha4 = LocalDate.of(2009, Month.DECEMBER, 15);	
		System.out.println("La fecha dentro de 1 mes es : " + fecha4.plusMonths(1) );
		
		
		LocalDate dateBefore = LocalDate.of(2001, Month.OCTOBER, 7);
		LocalDate dateAfter = LocalDate.of(2004, Month.MAY, 10);
		long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		System.out.println(noOfDaysBetween);
		
		//long dateAfter1 = Duration.between(dateBefore.atStartOfDay(), dateAfter.atStartOfDay()).toDays();
		//System.out.printf("Hay %d dias entre %s y %s", dateAfter, dateBefore, dateAfter);
		
		LocalDate monthBefore = LocalDate.of(2001, Month.OCTOBER, 7);
		LocalDate monthAfter = LocalDate.of(2004, Month.MAY, 10);
		long noOfMonthsBetween = ChronoUnit.MONTHS.between(dateBefore, dateAfter);
		System.out.println(noOfMonthsBetween);  
		
		LocalDate yearBefore = LocalDate.of(2001, Month.OCTOBER, 7);
		LocalDate yearAfter = LocalDate.of(2004, Month.MAY, 10);
		long noOfYearsBetween = ChronoUnit.YEARS.between(dateBefore, dateAfter);
		System.out.println(noOfYearsBetween);
		
		LocalDateTime hoursBefore = LocalDateTime.of(2001,Month.OCTOBER , 7 , 00,00);
		LocalDateTime hoursAfter = LocalDateTime.of(2004,Month.MAY , 10 , 00,00);
		long noOfHoursBetween = ChronoUnit.	HOURS.between(hoursBefore, hoursAfter);
		System.out.println(noOfHoursBetween);
		
		
		LocalDate period = LocalDate.of(2020, 2, 3);
		LocalDate period2 = LocalDate.of(2021, 7, 5);
		System.out.println(period.until(period2));
		
		//17
		System.out.printf("17, Dia de la semana %s%n" , LocalDate.now().minusDays(3).getDayOfWeek());
		
		//18
		
		System.out.printf("Mes:  %s%n  " , LocalDate.now().getMonth().getDisplayName(TextStyle.FULL , Locale.getDefault()));
		
		
		//19 
	     LocalDate.of(1940, 10, 1).getDayOfWeek();
	     System.out.printf("Dia de la semana:  %s%n " , LocalDate.of(1940, 10, 1).getDayOfWeek());
	     
	     //20
	     System.out.printf(" %s%n " , Year.of(1989).atDay(253));
	     
	     //21
	     
	     LocalTime time211 = LocalTime.of(10, 15);
	     LocalTime time212 = LocalTime.of(12, 30);
	     Duration d21 = Duration.between(time211, time212);
	     System.out.printf("21. entre %s y %s hay %d segundos%n" , time211 , time212, d21.toSeconds());
	     
	     
	     
	     
	}
}
