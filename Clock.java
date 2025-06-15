import java.util.*;
//Importing Required Classes
import java.time.LocalTime; //gets system time.
import java.time.format.DateTimeFormatter; //Format It

public class Clock {
    public static void main(String[] args) throws InterruptedException {  //	Allows the method to handle possible sleep interruption

        
        //Create a formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        while(true){
            LocalTime now = LocalTime.now() ; //Current Time !!
            System.out.println("\r" + now.format(formatter));  //\r is an escape sequence in Java that stands for carriage return.
            //It moves the cursor back to the beginning of the same line — without moving to the next line.

            Thread.sleep(1000);  // Wait For 1 sec.
        }
    }
}
