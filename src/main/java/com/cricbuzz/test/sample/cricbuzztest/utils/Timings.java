package com.cricbuzz.test.sample.cricbuzztest.utils;

import java.util.Calendar;
import java.util.TimeZone;

public class Timings {

	public static long currentTime() {
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		long time = cal.getTimeInMillis();
		return time;
	}
}
