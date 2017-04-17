/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.Calendar;
/**
 *
 * @author ltrinastic
 */
public class Challenge4 {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        LocalDateTime future = LocalDateTime.now().withYear(2017).withMonth(12).withDayOfMonth(25);
        Duration duration = Duration.between(date, future);
        long days = duration.toDays();
        System.out.println(days);
          
          
          
        
        
    }
 
    
    
    
}
