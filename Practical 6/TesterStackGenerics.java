

import java.util.Stack;
import java.util.Scanner;

public class TesterStackGenerics extends LinkedStackInteger {//this class tests the stacking using a generic stack
    //instead of solely an integer stack

   
    public static void main(String[] args) {
     LinkedStack Dan = new LinkedStack();
     Scanner sc=new Scanner(System.in);
       String input="";
       //my menu driven program is a while loop. so while the user has not entered
       //"q", the program continues. if the user inputs invalid data, then the loop just continues and asks for more input
       while(input!="q"){
           System.out.println("please enter a command");
           input=sc.nextLine();
           switch(input){
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
                   System.out.print("Please enter the thing you want to add: ");
                   Dan.push(sc.nextLine());
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
