package by.academy.homework4.task1;

import java.time.LocalDate;
import java.time.DayOfWeek;


public class CustomDate {
	
	private Year year;
	private Month month;
	private Day day;
	
	public CustomDate(String date) {
		super();
		int d = Integer.valueOf(date.substring(0,2));
		int m = Integer.valueOf(date.substring(3,5));
		int y = Integer.valueOf(date.substring(6));
		
		this.year = new Year(y);
		this.month = new Month(m);
		this.day = new Day(d);
	}
	
	public CustomDate(int d, int m, int y) {
		super();

		this.year = new Year(y);
		this.month = new Month(m);
		this.day = new Day(d);
	}

	class Year {
		private int year;
		
		public Year(int year) {
			super();
			this.year = year;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		@Override
		public String toString() {
			return "Year [year=" + year + "]";
		}
	}

	class Month {
		private int month;
	
		public Month(int month) {
			super();
			this.month = month;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		@Override
		public String toString() {
			return "Month [month=" + month + "]";
		}
	}

	class Day {
		private int day;

		public Day(int day) {
			super();
			this.day = day;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		@Override
		public String toString() {
			return "Day [day=" + day + "]";
		}
	}
	
	public void getDayOfWeek() {
		DayOfWeek dayOfWeek = LocalDate.of(year.getYear(), month.getMonth(), day.getDay()).getDayOfWeek();
		final int numberDay = dayOfWeek.getValue();
		DaysOfWeek allDays[] = DaysOfWeek.values();
		switch(numberDay) {
		case 1:
			System.out.println("День недели: " + allDays[0]);
			break;
		case 2:
			System.out.println("День недели: " + allDays[1]);
			break;
		case 3:
			System.out.println("День недели: " + allDays[2]);
			break;
		case 4:
			System.out.println("День недели: " + allDays[3]);
			break;
		case 5:
			System.out.println("День недели: " + allDays[4]);
			break;
		case 6:
			System.out.println("День недели: " + allDays[5]);
			break;
		case 7:
			System.out.println("День недели: " + allDays[6]);
			break;
		}
		
	}
	
	public void calculateDays(CustomDate otherCustomDate) {
		LocalDate localDate = LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
		LocalDate otherLocalDate = LocalDate.of(otherCustomDate.year.getYear(), otherCustomDate.month.getMonth(), otherCustomDate.day.getDay());
		System.out.println("Разница в днях между датами: " + Math.abs(localDate.toEpochDay() - otherLocalDate.toEpochDay()));
	}

	public void checkLeapYear() {
		final boolean isLeapYear = ((year.getYear() % 4 == 0) && (year.getYear() % 100 != 0) || (year.getYear() % 400 == 0));
		
		if (isLeapYear) {
			System.out.println(year.getYear() + " - високосный год");
		} else {
			System.out.println(year.getYear() + " - невисокосный год");
		}
	}
}
	
	
	
