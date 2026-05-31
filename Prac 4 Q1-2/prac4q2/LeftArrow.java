/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Daniel Collins
 */
public class LeftArrow extends ShapeBasics  {
     public int length;
     public int width;
     
     public LeftArrow(int length,int width){
         this.length=length; // this is the tail, and the offset of the triangle from the base
         this.width=width;//this is the height and the width of the actual triangle
     }
    public void makeArrow(){
        
        for (int i = 0; i < this.width; i++) {
            super.drawHere();
            if(this.width==0){
                System.out.println(" ");
            }
            if(i!=0 && i!=this.width){
                for (int j = 0; j < i*2; j++) {
                    System.out.print(' ');
                }
                System.out.print("*");
            }
           System.out.println("");

            
        }
        
    }
    
     public void drawHere(){
         ShapeBasics cheese=new ShapeBasics(4);
         cheese.drawHere();
     }
     public int getOffset(){
         return this.getOffset();
     }
     public void setOffset(int offset){
         this.setOffset(offset);
     }
}
