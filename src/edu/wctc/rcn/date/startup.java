
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
        LocalDateTime date = LocalDateTime.of(2017, 3, 30, 11, 59);
        System.out.println("Current date/time with custom format provided by DateTimeFormatter: " + formatDate.getFormattedLocalDateTimeToString(date, ""));
    }
    
}
