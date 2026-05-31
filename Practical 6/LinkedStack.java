/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Stack;

/**
 *this is the generic version of the linkedstackInteger
 * this class basically does the exact same thing but it can accept and stack any data type or 
 * object it is given 
 * @author User
 */
public class LinkedStack<T> {
    private T top;
       Stack<T> theStack=new Stack<>();//creates a new stack of type T, any type
       
       public T getTop(){
       return top;
        }
   public void push(T element){
       theStack.push(element); //this adds an element of type t to the top of the stack
   }
   public boolean isEmpty(){
       return theStack.isEmpty();  //returns true if the stack is empty and false if it is not
   }
   public int getHeight(){
      return theStack.size();
   }
   public void pop(){
       if (theStack.isEmpty()) {//uses another method to check if the stack is empty
           System.out.println("Cannot pop, stack is empty.");
       }
       else{
           theStack.pop();//if its not empty it removes the top item
           //System.out.println("the stack has been popped!");
       }
   }
   public T head(){
       return theStack.peek();
   }
   /*
    * this method makes a copy of the stack, then depletes the original stack by
    * printing the popped values, then replenishes the original stack again by 
    * adding the values from the copied stack
    */
   public void display(){
       if(theStack.isEmpty()){
           System.out.println("The stack is empty");
       }
       else{
      Stack<T> theClone=new Stack<>();
      theClone.addAll(theStack);
       while(theStack.isEmpty()==false){
           System.out.println(theStack.pop());
       }
       theStack.addAll(theClone);
       }
   }
}
