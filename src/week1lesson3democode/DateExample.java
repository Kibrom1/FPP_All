package week1lesson3democode;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateExample {

	
	public static void main(String[] args){
		
		/*Date d = new Date();
		System.out.println(d);
		Date d1 = new Date(1000000000);
		System.out.println(d1);
		System.out.println(d.after(d1));
		System.out.println(d1.after(d));
		
		Date d2 = (Date)d1.clone();
		System.out.println(d2);
		System.out.println(d.compareTo(d2));
		System.out.println(d1.compareTo(d1));
		System.out.println(d1.equals(d2));
		System.out.println(d.equals(d1));
		System.out.println(d.getTime());
		*/
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(Calendar.DATE));
		System.out.println(gc.get(Calendar.MONTH));
		//LocalDate dt = new LocalDate();
	}
	
}
