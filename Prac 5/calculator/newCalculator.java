/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
public class newCalculator extends Calculator {
     public static void main(String[] args){
         result = 0;
        }
    
    public void doCalculation () throws DivideByZeroException,
                                        UnknownOpException
    {
        Scanner keyboard = new Scanner (System.in);
        boolean done = false;
       
        System.out.println ("result = " + result);
        while (!done)
        {
            char nextOp = (keyboard.next ()).charAt (0);
            if ((nextOp == 'e') || (nextOp == 'E'))
                done = true;
            else
            {
                double nextNumber = keyboard.nextDouble ();
                result = evaluate (nextOp, result, nextNumber);
                System.out.println ("result " + nextOp + " " +
                        nextNumber + " = " + result);
                System.out.println ("updated result = " + result);
            }
        }
    }
}
