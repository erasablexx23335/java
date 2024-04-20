/* Java Program to create a toolbar with push buttons having images*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
class Toolbar implements ActionListener
{
    static JLabel text;
    static ImageIcon icon_open,icon_new,icon_print;
    //Driver function
    public static void main(String args[])
    {
	//Create a frame
	JFrame frame = new JFrame("Toolbar");
	frame.setSize(600,400);
	frame.getContentPane().setBackground(Color.white);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(new FlowLayout());
	//Create an object
	Toolbar obj =new Toolbar(); 
	//Create open button
	icon_open = new ImageIcon("open.jpg");
	JButton b_open = new JButton(icon_open);
	b_open.addActionListener(obj);
	//Create new button
	icon_new = new ImageIcon("new.jpg");
	JButton b_new = new JButton(icon_new);
	b_new.addActionListener(obj);
	//Create print button
	icon_print = new ImageIcon("print.jpg");
	JButton b_print = new JButton(icon_print);
	b_print.addActionListener(obj);
	//Create a toobar
	JToolBar bar = new JToolBar();
	bar.add(b_open);
	bar.add(b_new);
	bar.add(b_print);
	frame.add(bar);
	//Create a label
	text = new JLabel();
	frame.add(text);
	//Display the frame
	frame.setVisible(true);
    }
    //Function to view the button clicked
    public void actionPerformed(ActionEvent e)
    {
        //Create a button of the action event source
	JButton button = (JButton)e.getSource();
	//Get the icon of button
	String icon = button.getIcon().toString();
	//Display the button clicked
	if(icon.equals(icon_open.toString()))
	    text.setText("Button Clicked : Open");
        else if(icon.equals(icon_new.toString()))
	    text.setText("Button Clicked : New");
	else
	    text.setText("Button Clicked : Print");
    }
}
