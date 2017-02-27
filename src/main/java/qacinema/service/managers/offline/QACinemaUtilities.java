package qacinema.service.managers.offline;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class QACinemaUtilities {
	public static String getDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String date = dateFormat.format(cal);
		return date;
	}
}
