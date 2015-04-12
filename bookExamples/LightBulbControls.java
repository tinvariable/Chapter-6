package bookExamples;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LightBulbControls extends JPanel
{
	private LightBulbPanel bulb;
	private JButton onButton, offButton;
	
	public LightBulbControls (LightBulbPanel bulbPanel)
	{
		bulb = bulbPanel;
		
		onButton = new JButton("On");
		onButton.setEnabled(false);
		onButton.setMnemonic('n');
		onButton.setToolTipText("Turn it on!");
		onButton.setEnabled(false);
		onButton.setMnemonic('n');
		onButton.setToolTipText("Turn it on!");
		onButton.addActionListener(new OnListener());
		
		offButton = new JButton("Off");
		offButton.setEnabled(true);
		offButton.setMnemonic('f');
		offButton.setToolTipText("Turn it off!");
		offButton.addActionListener(new OffListener());
		setBackground(Color.black);
		add(onButton);
		add(offButton);
	}
	
	private class OnListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
		{
			bulb.setOn(true);
			onButton.setEnabled(false);
			offButton.setEnabled(true);
			bulb.repaint();
		}
	}
	
	private class OffListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			bulb.setOn(false);
			onButton.setEnabled(true);
			offButton.setEnabled(false);
			bulb.repaint();
		}
	}

}
