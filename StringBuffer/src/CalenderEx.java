import java.util.Calendar;

public class CalenderEx {
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);

		System.out.print(msg + year + "/" + month + "/" + day + "/");
		switch(dayOfWeek) {
		case Calendar.SUNDAY : System.out.print("Sunday"); break;
		case Calendar.MONDAY : System.out.print("Monday"); break;
		case Calendar.TUESDAY : System.out.print("Tuesday"); break;
		case Calendar.WEDNESDAY : System.out.print("Wednesday"); break;
		case Calendar.THURSDAY : System.out.print("Thursday"); break;
		case Calendar.FRIDAY: System.out.print("Friday"); break;
		case Calendar.SATURDAY : System.out.print("Saturday"); break;
		}
		
		System.out.print("(" + hourOfDay + " O'clock)");
		if(ampm== Calendar.AM) System.out.print("AM ");
		else System.out.print("PM ");
		System.out.println(hour + ":" + minute + ":" + second + " "
		+ millisecond +"milliseconds");
		}

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("Now", now);
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();
		// December 25, 2016. Month is set to 11 to express December
		firstDate.set(2016, 11, 25);
		firstDate.set(Calendar.HOUR_OF_DAY, 20); // 8 PM
		firstDate.set(Calendar.MINUTE, 30); // 30 minutes
		printCalendar("The first date I dated was ", firstDate);
	}
}
