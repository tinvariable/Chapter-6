package bookExamples;
import javax.swing.JOptionPane;

public class EvenOdd {

	public static void main(String[] args) 
	{
		String numStr, result;
		int num, again;
		
		do
		{
			numStr = JOptionPane.showInputDialog("Enger an Integer: ");
			num = Integer.parseInt(numStr);
			result = "That number is " + ((num%2 == 0) ? "even" : "odd");
			JOptionPane.showMessageDialog(null, result);
			again = JOptionPane.showConfirmDialog(null, "Do Another?");
			
		}
		while(again == JOptionPane.YES_OPTION);
		

	}

}
