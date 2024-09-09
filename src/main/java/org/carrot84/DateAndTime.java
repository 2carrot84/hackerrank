package org.carrot84;

import java.util.Calendar;
import java.util.Locale;

public class DateAndTime {
	private static Calendar calendar = Calendar.getInstance();
	public static String findDay(int month, int day, int year) {
		calendar.set(year, month - 1, day);
		return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_STANDALONE, Locale.US).toUpperCase();
	}
}
