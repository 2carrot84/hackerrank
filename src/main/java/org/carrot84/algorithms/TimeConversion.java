package org.carrot84.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		String result = Result.timeConversion(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

	public static class Result {
		public static String timeConversion(String s) {
			// split hh:mm:ss and AM or PM
			String hh = s.substring(0, 2);
			String mmss = s.substring(2, s.length() -2);
			String ampm = s.substring(s.length() -2);
			// calculate 24hour 22
			if ("AM".equals(ampm) && "12".equals(hh)) {
				hh = "00";
			} else if ("PM".equals(ampm) && !"12".equals(hh)) {
				hh = String.valueOf(Integer.parseInt(hh) + 12);
			}
			return hh + mmss;
		}

		public static String timeConversion2(String s) throws ParseException {
			DateFormat df = new SimpleDateFormat("hh:mm:ssa");
			DateFormat out = new SimpleDateFormat("HH:mm:ss");
			Date date = df.parse(s);
			return out.format(date);
		}
	}
}
