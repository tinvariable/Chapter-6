package programmingProjects;
import javax.swing.*;


public class PP610 extends JFrame 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("PP6.10");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new PP610Panel());
		
		frame.pack();
		frame.setVisible(true);
		

	}

}
