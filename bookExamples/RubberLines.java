package bookExamples;
import javax.swing.JFrame;

public class RubberLines {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Rubber Lines");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new RubberLinesPanel());
		
		frame.pack();
		frame.setVisible(true);
		

	}

}
