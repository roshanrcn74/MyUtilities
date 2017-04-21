package edu.wctc.rcn.date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This class provide the managing and using LocalDateTime,
 * JDK 1.8 and above
 *
 * @author Roshan, Nanayakkara rnanayakkara@my.wctc.edu
 * @version 1.00
 * @since 1.8
 */
public class DateUtilities {

    private String dateTimeFormat;

    /**
     * Default date time format "MMM d yyyy hh:mm a"
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
     * Convert a LocalDateTime object to a formatted string to default format
     * "MMM d yyyy hh:mm a" or custom format as per user specified.
     *
     * @param date
     * @param dateTimeFormat
     * @return
     * @throws NullPointerException if date is null, or DateTimeException if
     * month (1 - 12), (1 - 31) date, hours (1 -24) , minutes (1 -60) values out
     * of range.
     */
    public final String getFormattedLocalDateTimeToString(LocalDateTime date, String dateTimeFormat) throws NullPointerException, IllegalArgumentException {
        if (date == null || dateTimeFormat == null) {
            throw new NullPointerException();
        }
        if (!dateTimeFormat.isEmpty()) {
            this.dateTimeFormat = dateTimeFormat;
        }
        DateTimeFormatter format = DateTimeFormatter.ofPattern(this.dateTimeFormat);
        String formattedStringDate = date.format(format);
        return formattedStringDate;
    }

    //need to complete 
    public final String getDateFromDateTimeString(String dateTimeStringFormat) throws NullPointerException, IllegalArgumentException {
        if (dateTimeStringFormat == null || dateTimeStringFormat.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return dateTimeStringFormat;
    }

    /**
     * Calculate number of Days from now to user specific date.
     *
     * @param localDateTime
     * @return
     * @throws NullPointerException
     */
    public final long getNumberOfDaysFromNow(LocalDateTime localDateTime) throws NullPointerException {
        if (localDateTime == null) {
            throw new NullPointerException();
        }
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end
                = LocalDateTime.now()
                        .withYear(localDateTime.getYear())
                        .withMonth(localDateTime.getMonthValue())
                        .withDayOfMonth(localDateTime.getDayOfMonth())
                        .withHour(localDateTime.getHour())
                        .withMinute(localDateTime.getMinute());

        Duration duration = Duration.between(start, end);
        long days = duration.toDays();
        return days;
    }

    public final long getNumberOfHoursFromNow(LocalDateTime localDateTime) throws NullPointerException {
        if (localDateTime == null) {
            throw new NullPointerException();
        }
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end
                = LocalDateTime.now()
                        .withYear(localDateTime.getYear())
                        .withMonth(localDateTime.getMonthValue())
                        .withDayOfMonth(localDateTime.getDayOfMonth())
                        .withHour(localDateTime.getHour())
                        .withMinute(localDateTime.getMinute());

        Duration duration = Duration.between(start, end);
        long hours = duration.toHours();
        return hours;
    }

    public final long getNumberOfMinutesFromNow(LocalDateTime localDateTime) throws NullPointerException {
        if (localDateTime == null) {
            throw new NullPointerException();
        }
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end
                = LocalDateTime.now()
                        .withYear(localDateTime.getYear())
                        .withMonth(localDateTime.getMonthValue())
                        .withDayOfMonth(localDateTime.getDayOfMonth())
                        .withHour(localDateTime.getHour())
                        .withMinute(localDateTime.getMinute());

        Duration duration = Duration.between(start, end);
        long minutes = duration.toMinutes();
        return minutes;
    }

    public final long getNumberOfHoursFromStartEndTime(LocalDateTime startTime, LocalDateTime endTime) throws NullPointerException {
        if (startTime == null || endTime == null) {
            throw new NullPointerException();
        }
        LocalDateTime start = LocalDateTime.now()
                .withYear(startTime.getYear())
                .withMonth(startTime.getMonthValue())
                .withDayOfMonth(startTime.getDayOfMonth())
                .withHour(startTime.getHour())
                .withMinute(startTime.getMinute());
        LocalDateTime end
                = LocalDateTime.now()
                        .withYear(endTime.getYear())
                        .withMonth(endTime.getMonthValue())
                        .withDayOfMonth(endTime.getDayOfMonth())
                        .withHour(endTime.getHour())
                        .withMinute(endTime.getMinute());

        Duration duration = Duration.between(start, end);
        long hours = duration.toHours();
        return hours;
    }
}
