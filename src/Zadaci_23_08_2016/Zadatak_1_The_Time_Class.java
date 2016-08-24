package Zadaci_23_08_2016;

public class Zadatak_1_The_Time_Class {

	public static void main(String[] args) {
		/*
		 * *10.1 (The Time class) Design a class named Time. The class contains:
		 * ■ The data fields hour, minute, and second that represent a time. ■ A
		 * no-arg constructor that creates a Time object for the current time.
		 * (The values of the data fields will represent the current time.) ■ A
		 * constructor that constructs a Time object with a specified elapsed
		 * time since midnight, January 1, 1970, in milliseconds. (The values of
		 * the data fields will represent this time.) ■ A constructor that
		 * constructs a Time object with the specified hour, minute, and second.
		 * ■ Three getter methods for the data fields hour, minute, and second,
		 * respectively. ■ A method named setTime(long elapseTime) that sets a
		 * new time for the object using the elapsed time. For example, if the
		 * elapsed time is 555550000 milliseconds, the hour is 10, the minute is
		 * 19, and the second is 10. Draw the UML diagram for the class and then
		 * implement the class. Write a test program that creates two Time
		 * objects (using new Time() and new Time(555550000)) and displays their
		 * hour, minute, and second in the format hour:minute:second. (Hint: The
		 * first two constructors will extract the hour, minute, and second from
		 * the elapsed time. For the no-arg constructor, the current time can be
		 * obtained using System.currentTimeMillis(), as shown in Listing 2.7,
		 * ShowCurrentTime.java.)
		 */

		Time time1 = new Time();// objekat vraca tacno vrijeme
		Time time2 = new Time(555550000);// objektu se proslijedjuju milisekunde

		// ispis stanja objekta
		System.out.println((time1.getHour() + 2) + ":" + time1.getMinute()
				+ ":" + time1.getSecond());
		System.out.println(time2.getHour() + ":" + time2.getMinute() + ":"
				+ time2.getSecond());

	}

}

class Time {// kreiranje klase

	// data field
	public long hour;
	public long minute;
	public long second;

	public Time() {// konstruktor vraca tacno vrijeme
		long totalSeconds = System.currentTimeMillis() / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		this.hour = totalHours % 24;
		this.minute = totalMinutes % 60;
		this.second = totalSeconds % 60;

	}

	public Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public Time(long elapseTime) {// konstruktor prima broj milisekundi i vraca
									// u sate i min

		long totalSeconds = elapseTime / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		this.hour = totalHours % 24;
		this.minute = totalMinutes % 60;
		this.second = totalSeconds % 60;

	}

	// geteri
	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}
}
