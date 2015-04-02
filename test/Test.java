package test;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class Test {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("3 Borders");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		EmptyBorder empty = new EmptyBorder(15, 15, 15, 15);
		EtchedBorder etched = new EtchedBorder();
		LineBorder line = new LineBorder(Color.black);
		
		CompoundBorder inner = new CompoundBorder(empty, line);
		CompoundBorder outer = new CompoundBorder (inner, etched);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout (0, 2, 5, 10));
		panel.setBorder(outer);
		panel.add(new JButton("Border"));
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		
		
		

	}

}
