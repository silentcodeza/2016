/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class RightArrow extends ShapeBasics{
    
  
     public int length;
     public int width;
     
     public RightArrow(int length,int width){
         this.length=length; // this is the tail, and the offset of the triangle from the base
         this.width=width;//this is the height and the width of the actual triangle
     }
          public void makeArrow(){
             while(this.width < 3 || width%2==0){
                 this.width++;
                 System.out.println("width has been increased to " + this.width);
             }
        for (int i = 0; i < this.width; i++) {
            if(i!=this.width-1){
                for (int j = 0; j < this.length; j++) {
                   System.out.print(" ");
                }
            }
            if(i==this.width-1){
                for (int j = 0; j < this.length; j++) {
                    System.out.print("*");
                }
            }
            super.drawHere();
            if(i!=0){
                for (int j = 0; j < i*2; j++) {
                    System.out.print(' ');
                }
                System.out.print("*");
            }
           System.out.println("");            
        }
              for (int i = this.width-1; i >0; i--) {
                  for (int j = 0; j < this.length; j++) {
                      System.out.print(" ");
                  }
                  super.drawHere();
                  if(i!=0){
                      for (int j =this.width-1; j >2-i; j--) {
                          
                          System.out.print(" ");
                      }
                      System.out.print("*");
                  }
                  System.out.println("");
              }
              for (int i = 0; i < this.length; i++) {
                  System.out.print(" ");
              }
              System.out.println("*");
    }
}
