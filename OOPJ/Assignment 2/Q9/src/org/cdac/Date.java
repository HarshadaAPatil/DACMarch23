package org.cdac;
/*
 * 	The Date class should have the following methods:
		a. isValid(): A method to check if the date is valid or not. A date is considered valid if it is a valid date of the Gregorian 
		calendar, and has a day, month, and year that are within a reasonable range.
		b. getDayOfWeek(): A method to return the day of the week for the given date, where Sunday is represented by 0, Monday by 1, and so on.
		c. isLeapYear(): A method to check if the year of the given date is a leap year or not.
		d. getNextDay(): A method to return the date of the next day.
		e. getPreviousDay(): A method to return the date of the previous day.
	Example Usage
	Date date = new Date(31, 12, 2022);
	System.out.println(date.isValid()); // true
	System.out.println(date.getDayOfWeek()); // 6 (Saturday)
	System.out.println(date.isLeapYear()); // false
	Date nextDay = date.getNextDay();
	System.out.println(nextDay); // 01-01-2023
	Date previousDay = date.getPreviousDay();
	System.out.println(previousDay); // 30-12-202*/
public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		
	}
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
