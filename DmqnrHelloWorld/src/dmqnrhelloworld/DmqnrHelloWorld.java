/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmqnrhelloworld;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Daniel Marin
 */
public class DmqnrHelloWorld {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        String myPawPrint;
        myPawPrint = "dmqnr";
        
        invokeMe(myPawPrint);
    }
    
    public static void invokeMe(String pawPrint){

            System.out.println("My PawPrint is \"" +  pawPrint + "\"");
            
            LocalDateTime current = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
            String currentTimeFormated = current.format(format); 
            System.out.println("Today's date is " + currentTimeFormated);
           
    }
}

