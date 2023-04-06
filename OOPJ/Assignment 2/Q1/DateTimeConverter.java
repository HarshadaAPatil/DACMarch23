/**  
     Date and Time Converter
        Accept date and time from user. 
        You are required to write a Java program to convert dates and times between different formats.
        The program should be able to convert dates between the following formats:
            a. dd/mm/yyyy (e.g., 31/12/2022)
            b. mm/dd/yyyy (e.g., 12/31/2022)
            c. yyyy/mm/dd (e.g., 2022/12/31)
        The program should be able to convert times between the following formats:
            a. hh:mm:ss (e.g., 23:59:59)
            b. hh:mm:ss a (e.g., 11:59:59 PM)
            c. hh:mm (e.g., 23:59)
        The program should be able to convert dates and times between the following formats:
            a. dd/mm/yyyy hh:mm:ss (e.g., 31/12/2022 23:59:59)
            b. mm/dd/yyyy hh:mm:ss a (e.g., 12/31/2022 11:59:59 PM)
            c. yyyy/mm/dd hh:mm (e.g., 2022/12/31 23:59)    
*/
import java.time.*;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.format.*;

class DateTimeConverter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the date : ");
        // System.out.print("Day      :   ");
        // dt.setDay(sc.nextInt());
        // System.out.print("Month    :   ");
        // dt.setMonth(sc.nextInt());
        // System.out.print("Year     :   ");
        // dt.setYear(sc.nextInt());
        String str=sc.nextLine();
        LocalDate myDateObj = LocalDate.parse(str);
        // LocalDate myDateObj = LocalDate.of(dt.getYear(),dt.getMonth(),dt.getDay());
        System.out.println("Before formatting: " + myDateObj);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting (dd/MM/yyyy): " + formattedDate);

        myFormatObj = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting (MM/dd/yyyy): " + formattedDate);

        myFormatObj = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting (yyyy/MM/dd): " + formattedDate);
  }
}