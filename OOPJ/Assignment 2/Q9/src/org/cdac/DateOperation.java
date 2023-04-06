package org.cdac;
import java.time.LocalDate;
import java.util.*;
public class DateOperation {

	Date dt=new Date();
	static Scanner sc=new Scanner(System.in);
	void acceptDate() {
		System.out.println("Enter day : ");
		dt.setDay(sc.nextInt());
		System.out.println("Enter month : ");
		dt.setMonth(sc.nextInt());
		System.out.println("Enter year : ");
		dt.setYear(sc.nextInt());
	}
	
	boolean isValid() {
		if(dt.getMonth()==8 || dt.getMonth()==1 || dt.getMonth()==3 || dt.getMonth()==5 || dt.getMonth()==7 || 
				dt.getMonth()==10 || dt.getMonth()==12) {
			if(dt.getDay()<=31 && dt.getDay()>=1) {
				return true;
			}
			else 
				return false;
		}
		else if(dt.getMonth()==02) {
			if (((dt.getYear() % 4 == 0) && (dt.getYear() % 100 != 0)) || (dt.getYear() % 400 == 0)) {
		           if(dt.getDay()<=29 && dt.getDay()>=1) {
		        	   return true;
		           }
			}
		    else if(dt.getDay()<=28 && dt.getDay()>=1) {
		        	   return true;
		           }
		        else {
		           return false;
		        }
		}
		
		else
			if(dt.getDay()<=30 && dt.getDay()>=1)
				return true;
		return false;
	}
	
	void getDayOfWeek() {
		LocalDate localdt = LocalDate.of(dt.getYear(),dt.getMonth() ,dt.getDay());
        System.out.println(localdt.getDayOfWeek());
	}
	
	boolean isLeapYear() {
		return (((dt.getYear() % 4 == 0) && (dt.getYear() % 100 != 0)) || (dt.getYear() % 400 == 0));
	}
	
	void getNextDay() {
		LocalDate localdt = LocalDate.of(dt.getYear(),dt.getMonth() ,dt.getDay());
        System.out.println("Next Date : "+localdt.plusDays(1));
	}
	
	void getPreviousDay() {
		LocalDate localdt = LocalDate.of(dt.getYear(),dt.getMonth() ,dt.getDay());
        System.out.println("Previous Date : "+localdt.minusDays(1));
	}
	static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.isValid()");
		System.out.println("2.getDayOfWeek()");
		System.out.println("3.isLeapYear()");
		System.out.println("4.getNextDay()");
		System.out.println("5.getPreviousDay()");
		System.out.println("Enter your choice : ");
		return sc.nextInt();
	}
}
