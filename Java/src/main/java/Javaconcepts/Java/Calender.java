package Javaconcepts.Java;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/YYYY  hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.DAY_OF_WEEK_IN_MONTH);
		System.out.println(cal.DAY_OF_YEAR);

	}

}
