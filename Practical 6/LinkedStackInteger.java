

import java.util.Stack;
public class LinkedStackInteger {
   private Integer top;
   Stack<Integer> theStack=new Stack<>();
   public Integer getTop(){
       return top;
   }
   public void push(Integer element){//adds an item to the stack
       theStack.push(element);
   }
   public boolean isEmpty(){//returns true if the stack is empty otherhwise returns false
       return theStack.isEmpty();
   }
   public int getHeight(){//returns the size of the stack
      return theStack.size();
   }
   public void pop(){//removes the top item of the stack if there is one
       if (theStack.isEmpty()) {
           System.out.println("Cannot pop, stack is empty.");
       }
       else{
           theStack.pop();
           System.out.println("the stack has been popped!");
       }
   }
   public Integer head(){//returns the top item of the list
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
      Stack<Integer> theClone=new Stack<>();
      theClone.addAll(theStack);
       while(theStack.isEmpty()==false){
           System.out.println(theStack.pop());
       }
       theStack.addAll(theClone);
       }
   }
}

