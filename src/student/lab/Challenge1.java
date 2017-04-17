/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.Duration;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author ltrinastic
 */
public class Challenge1 {
    public static void main(String[] args) {
        
    
       LocalDateTime start = LocalDateTime.now().withHour(13).withMinute(45); 
       LocalDateTime end = LocalDateTime.now().withHour(15).withMinute(12);
       
       Duration diff = Duration.between(start, end);
       long hours = diff.toHours();
       long minutes = diff.toMinutes() % 60;
       System.out.println("You are paying for " + hours + " minutes" + minutes);
}
}