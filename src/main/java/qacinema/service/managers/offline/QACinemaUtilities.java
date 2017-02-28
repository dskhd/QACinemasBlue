package qacinema.service.managers.offline;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class QACinemaUtilities {
	private QACinemaUtilities(){
		// Empty constructor to override default constructor and prevent instantiation
	}
	
	public static String getDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		return dateFormat.format(cal.getTime());
	}
}
