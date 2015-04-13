package programmingProjects;
import java.awt.Component;

import javax.swing.*;

public class PP69 extends JFrame
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		PP69Panel panel = new PP69Panel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
		

	}

}
