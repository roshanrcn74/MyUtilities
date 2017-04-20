
package edu.wctc.rcn.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This class provide the user to get custom dateTime format using LocalDateTime
 * JDK 1.8 and above
 * @author Roshan, Nanayakkara rnanayakkara@my.wctc.edu
 * @version 1.00
 * @since 1.8
 */
public class DateUtilities {

    private String dateTimeFormat;

    /**
     * Default date time format "MMM d yyyy  hh:mm a"
     */
    public DateUtilities() {
        this.dateTimeFormat = "MMM d yyyy  hh:mm a";
    }
    
    /**
     * 
     * @param dateTimeStringFormat - custom date time format can setup
     */
    public DateUtilities(String dateTimeStringFormat) {
        this.dateTimeFormat = dateTimeStringFormat;
    }

    /**
     * Convert a LocalDateTime object to a formatted string to default format "MMM d yyyy hh:mm a"
     * or custom format as per user specified.
     *
     * @param date
     * @param dateTimeFormat
     * @return 
     * @throws NullPointerException if date is null, or DateTimeException if
     * month (1 - 12), (1 - 31) date, hours (1 -24) , minutes (1 -60) values out
     * of range.
     */
    public final String getFormattedLocalDateTimeToString(LocalDateTime date, String dateTimeFormat) throws NullPointerException, IllegalArgumentException{
        if (date == null || dateTimeFormat == null) {
            throw new NullPointerException();
        }
        if (!dateTimeFormat.isEmpty()){
            this.dateTimeFormat = dateTimeFormat;
        }
        DateTimeFormatter format = DateTimeFormatter.ofPattern(this.dateTimeFormat);
        String formattedStringDate = date.format(format);
        return formattedStringDate;
    }

    public final String getDateFromDateTimeString(String dateTimeStringFormat)throws NullPointerException, IllegalArgumentException {
        if (dateTimeStringFormat == null || dateTimeStringFormat.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return dateTimeStringFormat;
    }
}
