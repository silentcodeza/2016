import javax.swing.JApplet;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
Simple demonstration of adding buttons to an applet.
These buttons do something when clicked.
*/
public class panes extends JApplet implements ActionListener
{
    public void init()
    {
	System.out.println("this method init as been run");
        Container contentPane = getContentPane();
	contentPane.setSize(500,500);
	contentPane.setVisible(true);
        contentPane.setBackground (Color.WHITE);
        contentPane.setLayout (new FlowLayout());
        JButton sunnyButton = new JButton ("Sunny");
        contentPane.add(sunnyButton);
        sunnyButton.addActionListener(this);
        JButton cloudyButton = new JButton("Cloudy");
        contentPane.add(cloudyButton);
        cloudyButton.addActionListener(this);
	
    }


    public void actionPerformed(ActionEvent e)
    {
        Container contentPane = getContentPane();
        if (e.getActionCommand().equals("Sunny"))
            contentPane.setBackground(Color.BLUE);
        else if(e.getActionCommand().equals("Cloudy"))
            contentPane.setBackground(Color.GRAY);
        else
            System.out.println ("Error in button interface.");
    }
}