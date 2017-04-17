/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.LocalDate;
import java.time.Year;

/**
 *
 * @author ltrinastic
 */
public class Challenge2 {
    public static void main(String[] args) {
        

    LocalDate startDate = LocalDate.now().withYear(2050);
    for(int i = 2050; i < 4; i++){
        if(Year.isLeap(i)){
            System.out.println("The next leap year is " + i);
            break;
        }
    }
    
}
}