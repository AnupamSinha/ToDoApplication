package co.assesment.emirates.toDoApp.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * The Class TaskUtil.
 */
public final class TaskUtil {
	/**
	 * Instantiates a new task util.
	 */
	private TaskUtil() {
	}

	/**
	 * Convert date to string.
	 *
	 * @param date
	 *            the date
	 * @return the string
	 */
	public static String convertDateToString(Date date) {
		DateFormat df = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
		String strDate = null;
		if (date != null) {
			strDate = df.format(date);
		} else {
			strDate = "";
		}
		return strDate;
	}

	/**
	 * Convert string to date.
	 *
	 * @param strDate
	 *            the str date
	 * @return the date
	 */
	public static Date convertStringToDate(String strDate) {
		DateFormat format = new SimpleDateFormat("mm/dd/yyyy", Locale.ENGLISH);
		Date date = null;
		try {
			date = format.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Date is Pre-formatted");
		}
		return date;
	}
}
