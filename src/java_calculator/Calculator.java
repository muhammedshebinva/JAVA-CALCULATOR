package java_calculator;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Calculator {
	public Calculator() {
		JFrame jf=new JFrame("CALCULATOR");
		jf.setLayout(null);
		jf.setSize(500,600);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel displayLabel=new JLabel();
		displayLabel.setBounds(10, 20, 460,50);
		displayLabel.setBackground(Color.CYAN);
		displayLabel.setOpaque(true);
		
		jf.add(displayLabel);
		
		JButton sevenbtn=new JButton("7");
		sevenbtn.setBounds(10, 110, 60, 50);
		jf.add(sevenbtn);
	}
	public static void main(String a[]) {
		new Calculator();
	}

}
