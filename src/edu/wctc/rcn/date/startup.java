
package edu.wctc.rcn.date;

import java.time.LocalDateTime;

/**
 *
 * @author Roshan, Nanayakkara rnanayakkara@my.wctc.edu
 * @version 1.00
 */
public class startup {
    public static void main(String[] args) {
        //DateUtilities formatDate = new DateUtilities("MMM d yyyy  hh:mm a");
        DateUtilities formatDate = new DateUtilities();
        
        //LocalDateTime date = LocalDateTime.of(2017, Month.APRIL, 18, 15, 28);
        LocalDateTime date = LocalDateTime.of(2017, 04, 21, 17, 59);
        System.out.println("Current date/time with custom format provided by "
                + "DateTimeFormatter: " + formatDate.getFormattedLocalDateTimeToString(date, ""));
        
        System.out.println("Number of Days :" + formatDate.getNumberOfDaysFromNow(date));
        System.out.println("Number of Hours :" + formatDate.getNumberOfHoursFromNow(date));
        System.out.println("Number of Minutes :" + formatDate.getNumberOfMinutesFromNow(date));
        
        
        LocalDateTime startDateTime = LocalDateTime.of(2017, 04, 21, 17, 59);
        LocalDateTime endDateTime = LocalDateTime.of(2017, 04, 21, 17, 59);
        
        System.out.println("Number of hours between start and end :" + 
                formatDate.getNumberOfHoursFromStartEndTime(startDateTime, endDateTime));
        
        
    }  
}
