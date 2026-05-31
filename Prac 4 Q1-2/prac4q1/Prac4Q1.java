/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Prac4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Doctor Daniel=new Doctor("Daniel","feet",22.0);
        
        Doctor Tim = new Doctor("Timmy jones","pediatrician",300.00);
        System.out.println(Daniel.getName());
        System.out.println(Tim.getName());
        Daniel.writeOutput();
        Tim.writeOutput();
        System.out.println(Daniel.equals(Tim));
        System.out.println(Daniel.equals(Daniel));
    }
}
