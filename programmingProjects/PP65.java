package programmingProjects;

import javax.swing.JFrame;
public class PP65 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Direction");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new PP65Panel());
		
		frame.pack();
		frame.setVisible(true);
		

	}

}
