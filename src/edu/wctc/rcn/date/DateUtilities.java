/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.rcn.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This class provide the LocalDateTime custom format
 *
 * @author Roshan, Nanayakkara rnanayakkara@my.wctc.edu
 * @version 1.00
 * @since 1.8
 */
public class DateUtilities {

    private String dateTimeStringFormat;
    private String date;

    /**
     * Default date time format "MMM d yyyy  hh:mm a"
     */
    public DateUtilities() {
        this.dateTimeStringFormat = "MMM d yyyy  hh:mm a";
    }
    
    /**
     * 
     * @param dateTimeStringFormat - custom date time format can setup
     */
    public DateUtilities(String dateTimeStringFormat) {
        this.dateTimeStringFormat = dateTimeStringFormat;
    }

    /**
     * Convert a LocalDateTime object to a formatted string
     *
     * @param date
     * @throws NullPointerException if date is null, or DateTimeException if
     * month (1 - 12), (1 - 31) date, hours (1 -24) , minutes (1 -60) values out
     * of range.
     */
    public void convertLocalDateTimeToFormattedString(LocalDateTime date) {
        if (date == null) {
            throw new NullPointerException();
        } 
        DateTimeFormatter format = DateTimeFormatter.ofPattern(dateTimeStringFormat);
        String formattedStringDate = date.format(format);
        this.date = formattedStringDate;
    }

    public void setDateTimeStringFormat(String dateTimeStringFormat) {
        if (dateTimeStringFormat == null || dateTimeStringFormat.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.dateTimeStringFormat = dateTimeStringFormat;
    }

    public String getDate() {
        return date;
    }

}
