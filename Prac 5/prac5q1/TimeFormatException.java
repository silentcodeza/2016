/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prac5q1;


public class TimeFormatException extends Exception {

    public TimeFormatException() {
        super("This time doesnt exist: ");
    }


    public TimeFormatException(String msg) {
        super(msg);
    }
}
