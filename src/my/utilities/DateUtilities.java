/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;


/**
 * A portable Date Time utility class using JDK 8
 * @version 1.0
 *
 * @author Leslee Trinastic
 */
public class DateUtilities {
    
    /**
     * Converts a local date time object to a formatted string 
     * @param pattern
     * @return 
     */
    public String formatDate(String pattern){
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern(pattern);
        String strDate = date.format(format);
        return strDate;
    }
    
    /**
     * Convert a string to a date time object 
     * @param date
     * @return 
     * @throws java.text.ParseException
     */
    public String format(String date) throws ParseException{      
        String strDate = date;
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
        //SimpleDateFormat sdf2 = new SimpleDateFormat(pattern);
        Date date3;
        date3 = sdf.parse(strDate);
        return date3.toString();
    }
    
    /**
     * Gets difference in hours and minutes between to dates
     * 
     * @return 
     */
    public String timeDiff(){
        LocalDateTime startDate = LocalDateTime.now();
        LocalDateTime curDate = LocalDateTime.now();
        LocalDateTime endDate = curDate.with(TemporalAdjusters.lastDayOfMonth()).minusMinutes(500);
        Duration diff2 = Duration.between(startDate, endDate);
        long hrs = diff2.toHours();
        long min = diff2.toMinutes() % 60;
        return ("Hours: " + hrs + ", Minutes: " + min);
    }
    
    /**
     * Creates a local time object for a date in the future 
     * @return
     */
    public LocalDateTime futureDate(){
        Long futureTime = null;
        Long time = futureTime;
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dueDate = now.plusDays(time);
        return dueDate;
    }
    
      /**
     * Creates a local time object for a date in the past 
     * @return
     */
    public LocalDateTime pastDate(){
        Long pastTime = null;
        Long time = pastTime;
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dueDate = now.minusDays(time);
        return dueDate;
    }
    
}

