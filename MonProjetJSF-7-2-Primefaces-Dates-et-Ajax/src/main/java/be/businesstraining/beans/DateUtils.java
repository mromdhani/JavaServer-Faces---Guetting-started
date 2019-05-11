package be.businesstraining.beans;

import java.util.Date;

public class DateUtils {
  
  /** Given a Date, returns a String of the form "Day, Month Number, Year", 
   *  e.g., "Wednesday, November 14, 2012". Used by getStartDay and getEndDay.
   */
  public static String formatDay(Date date) {
    if (date == null) {
      return("");
    } else {
      return(String.format("%tA, %tB %te, %tY", 
                           date, date, date, date));
    }
  }
  
  /** Given a Date, returns a String of the form "hh:mm:ss am on Day, Month Number, Year", 
   *  e.g., "12:23:42 pm on Wednesday, November 14, 2012". Used by getSampleTime.
   */
  public static String formatTime(Date date) {
    if (date == null) {
      return("");
    } else {
      return(String.format("%tl:%tM:%tS %tp on %tA, %tB %te, %tY", 
                            date, date, date, date, date, date, date, date));
    }
  }
  
  public static void main(String[] args) {
    Date d = new Date();
    System.out.println("Day: " + formatDay(d));
    System.out.println("Time: " + formatTime(d));
  }
  
  private DateUtils() {} // Uninstantiatable class
}
