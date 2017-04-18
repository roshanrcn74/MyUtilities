/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        DateUtilities formatDate = new DateUtilities("dd-MMM-yyyy");
        
        //LocalDateTime date = LocalDateTime.of(2017, Month.APRIL, 18, 15, 28);
        LocalDateTime date = LocalDateTime.of(2017, 3, 30, 15, 59);
        
        formatDate.convertLocalDateTimeToFormattedString(date);
        
        System.out.println("Current date/time with custom format provided by DateTimeFormatter: " + formatDate.getDate());
    }
    
}
