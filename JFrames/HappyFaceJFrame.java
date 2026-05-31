import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.Graphics;
/**
JFrame that displays a happy face.
Author: Jane Q. Programmer.
Revision of Listing 2.9.
*/
public class HappyFaceJFrame extends JFrame{
    
    public HappyFaceJFrame(){
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args){

		HappyFaceJFrame guiWindow = new HappyFaceJFrame();
		guiWindow.setLayout (new FlowLayout ());
		JButton theButton = new JButton ("this is a button");
		theButton.setSize(100,100);
		guiWindow.add(theButton);
		theButton.setVisible(true);
		guiWindow.setVisible(true);

	}
}