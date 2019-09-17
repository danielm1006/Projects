/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmqnrlanguagebasics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

/**
 *
 * @author dmqnr
 */
public class DmqnrLanguageBasics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65;
        
        short qualityScore = 72;
        
        float milesPerGallon = (float)32.44;
        float miles = (float)50;
        float gasPrice = (float)2.955;
        
        boolean sunny = true;
        boolean warm = false;
        
        int hour;
        int minute;
        //code from GeeksforGeeks https://www.geeksforgeeks.org/localtime-getminute-method-in-java-with-examples/
        LocalTime time = LocalTime.now();
        hour = time.getHour();
        minute = time.getMinute();
        
        String greeting = "Hello";
        String myPawPrint = "dmqnr";
        
        if(c1 == c2){
            System.out.printf("%s and c2 are the same\n", c1, c2);
        }
        else{
            System.out.printf("%s and %c are NOT the same\n", c1, c2);
        }
        
        if(qualityScore >= 0 && qualityScore <= 60){
            System.out.printf("The quality is bad\n");
        }
        else{
            System.out.printf("Good Quality\n");
        }
        
        float totalCost = miles / milesPerGallon * gasPrice;
        System.out.printf("Total Cost = %.4f\n", totalCost);
        
        if(sunny == true && warm == true){
            System.out.printf("Go hiking./n");
        }
        else if(sunny == false && warm == true){
            System.out.printf("Go barbecue.\n");
        }
        else{
            System.out.printf("Stay home\n");
        }

        switch (hour){
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10:
                if(minute < 10){
                    System.out.println("The current time is " + hour + ":0" + minute + " in the MORNING");
                    break;
                }
                System.out.println("The current time is " + hour + ":" + minute + " in the MORNING");
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                if(minute < 10){
                    System.out.println("The current time is " + hour + ":0" + minute + " in the AFTERNOON");    
                    break;
                }
                System.out.println("The current time is " + hour + ":" + minute + " in the AFTERNOON");    
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                if(minute < 10){
                    System.out.println("The current time is " + hour + ":0" + minute + " in the EVENING");
                    break;    
                }
                System.out.println("The current time is " + hour + ":" + minute + " in the EVENING");
                break;
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:    
            case 4:
                if(minute < 10){
                    System.out.println("The current time is " + hour + ":0" + minute + " in the NIGHT");
                    break;
                }
                System.out.println("The current time is " + hour + ":" + minute + " in the NIGHT");
                break;
            default:
                System.out.println("You have the wrong time ");
                break;
        }
        
        for(int count = 2; count <= 6; count++){
            if(count%3 == 0){
                System.out.printf("Count: %d\n",count);
            }
        }
        
        int countDown = 3;
        while(countDown > 0){
            System.out.printf("Count Down: %d\n",countDown);
            countDown--;
            if(countDown == 0){
                System.out.printf("Houston, we have lift off!\n");
            }
        }
        
        invokeMe(greeting, myPawPrint);
        
    }
    
    public static void invokeMe(String greeting, String pawPrint){
            //Code from https://www.javatpoint.com/java-localdatetime
            LocalDateTime current = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm");
            String currentTimeFormated = current.format(format); 
            
            System.out.println(greeting + ", my pawprint is " + pawPrint + " and today's date is " + currentTimeFormated);
    }
    
}
