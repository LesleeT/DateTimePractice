/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ltrinastic
 */
public class Practice {
    public static void main(String[] args) {
        
        Calendar date1 = Calendar.getInstance();
        date1.add(Calendar.DATE, 30);// add a - in front of the 30 to go back in time---you can also do months or years instead of days, etc.
        Date date = date1.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
        System.out.println(sdf.format(date));
        
        int max = date1.getActualMaximum(Calendar.DATE);
        System.out.println("Last day of month: " + max);//shows the last day of the month
        
        
        
//        Calendar date1 = Calendar.getInstance();
//        Calendar date2 = Calendar.getInstance();
//        date2.set(2000, 3, 0);
//        //the strike through Date tells you its deprecated
//        
//        boolean isAfter = date1.after(date2);
//        if(isAfter){
//            System.out.println("Date one IS after date two");
//            //System.out.println(date2);
//        }else{
//            System.out.println("Date one is NOT after date two");
//        }
//        
        
        
        

        
        
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");//the lowercase h gives regular time and the a gives am/pm
//        Date now = new Date();//this object represents both date and time
//        //Convert Date to String
//        
//        String fmtDate = sdf.format(now);
//        //System.out.println(fmtDate);
//        
//        //Convert String to Date -- make sure formats are the same
//        String strDate = "01/02/2000 01:02:03 pm";
//        try{
//            Date date3 = sdf.parse(strDate);
//            System.out.println(date3.toString());
//        }catch (ParseException p){
//            System.out.println("Sorry you must match the format to do this work.");
//        }
        
        
        
        
        
        //Calendar now2 = Calendar.getInstance();
        //calendar has multple types of calendar (like gregorian calendar etc. use this so its not rigid
        //int weekOfYear = now2.get(Calendar.WEEK_OF_YEAR);
        //int offset = now2.get(Calendar.ZONE_OFFSET/(60*60*1000));
        //System.out.println(offset);
        //System.out.println("Week of Year: " + weekOfYear);
        //Date calDate = now2.getTime();
        //System.out.println(sdf.format(calDate)+ " Week of Year: " + weekOfYear );//you cannot format calendars, only dates
        
        
    }
    
}
