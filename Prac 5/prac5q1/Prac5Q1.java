
package prac5q1;

import java.util.Scanner;
public class Prac5Q1{
       Scanner keyboard=new Scanner(System.in);
       String time;
    public static void main(String[] args){
        Prac5Q1 Dan=new Prac5Q1();
       Dan.Runner();
        }
    
        public void Runner(){
             try{
                System.out.println("enter time in 24-hour notation: ");
                time=keyboard.nextLine();
                if(!time.contains(":")){
                    throw new TimeFormatException(time);
                }
                int hours= Integer.parseInt(time.substring(0,time.indexOf(":")));
                int minutes=Integer.parseInt(time.substring(time.indexOf(":")+1));
                String min=time.substring(time.indexOf(":")+1);
                if(minutes>59 || minutes<0){
                    throw new TimeFormatException(time);
                }
                if(hours>23 || hours<0){
                    throw new TimeFormatException(time);
                }
                String TOD="";
                
                if(hours>11){
                    TOD  = "PM";
                }
                else{
                    TOD="AM";
                }
                if(hours!=12){
                hours=hours%12;
                }
                String newTime= ""+hours + ":" + min + " " + TOD;
                 System.out.println("That is the same as :");
                 System.out.println(newTime);
                 System.out.println("again? (y/n)");
                 String answer=keyboard.nextLine();
                 switch (answer) {
                     case "y":
                         Runner();
                         break;
                     case "n":
                         System.out.println("End of program");
                         System.exit(0);
                         break;
                 }
                 
             }
        catch(TimeFormatException e){
            String message = "Time given does not exist: " +e.getMessage(); // Warren helped me with this part :)
            System.out.println(message);
            System.out.println("Try again:");
            Runner();
        }
        catch(NumberFormatException e){
            System.out.println("Time given is not valid: "+ time);
            System.out.println("Try again:");
            Runner();
        }
        }
        
    }

