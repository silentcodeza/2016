

import java.util.Stack;
import java.util.Scanner;

public class TesterStackOfIntegers extends LinkedStackInteger {

   
    public static void main(String[] args) {
     LinkedStackInteger Dan = new LinkedStackInteger();
     Scanner sc=new Scanner(System.in);
       String input="";
       //my menu driven program is a while loop. so while the user has not entered
       //"q", the program continues. if the user inputs invalid data, then the loop just continues and asks for more input
       while(input!="q"){
           System.out.println("please enter a command");
           input=sc.nextLine();
           switch(input){ //swtich case switching dependant on the users input
               case "q": 
                   System.out.println("byebye");
                   System.exit(0);
                   break;
               case "height":
                   System.out.println("the list has " + Dan.getHeight() + " elements");
                   break;
               case "empty":
                   System.out.println(Dan.isEmpty());
                   break;
               case "push" : 
                   System.out.print("enter the number you want to add please: ");
                   Dan.push(sc.nextInt());
                   break;
               case "pop":
                   Dan.pop();
                   break;
               case "head":
                   System.out.println(Dan.head());
                   break;
               case "display":
                   Dan.display();
                   break;
               
                   
           }
       }
       System.exit(0);
    }
}
