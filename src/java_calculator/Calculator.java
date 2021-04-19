package java_calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Calculator implements ActionListener {
	JFrame jf;
	boolean isopratorclicked=false;
	
	public Calculator() {
		jf=new JFrame("CALCULATOR");
		jf.setLayout(null);
		jf.setSize(310,600);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel displayLabel=new JLabel();
		displayLabel.setBounds(10, 20, 270,50);
		displayLabel.setBackground(Color.CYAN);
		displayLabel.setOpaque(true);
		
		jf.add(displayLabel);
		
		JButton sevenbtn=new JButton("7");
		sevenbtn.setBounds(10, 110, 60, 50);
		jf.add(sevenbtn);
		JButton eightbtn=new JButton("8");
		eightbtn.setBounds(80, 110, 60, 50);
		jf.add(eightbtn);
		JButton ninebtn=new JButton("9");
		ninebtn.setBounds(150, 110, 60, 50);
		jf.add(ninebtn);
		
		JButton fourbtn=new JButton("4");
		fourbtn.setBounds(10, 170, 60, 50);
		jf.add(fourbtn);
		JButton fivebtn=new JButton("5");
		fivebtn.setBounds(80, 170, 60, 50);
		jf.add(fivebtn);
		JButton sixbtn=new JButton("6");
		sixbtn.setBounds(150, 170, 60, 50);
		jf.add(sixbtn);
		
		JButton onebtn=new JButton("1");
		onebtn.setBounds(10, 230, 60, 50);
		jf.add(onebtn);
		JButton twobtn=new JButton("2");
		twobtn.setBounds(80, 230, 60, 50);
		jf.add(twobtn);
		JButton threebtn=new JButton("3");
		threebtn.setBounds(150, 230, 60, 50);
		jf.add(threebtn);
		
		JButton dotbtn=new JButton(".");
		dotbtn.setBounds(10, 290, 60, 50);
		jf.add(dotbtn);
		JButton zerobtn=new JButton("0");
		zerobtn.setBounds(80, 290, 60, 50);
		jf.add(zerobtn);
		JButton equalbtn=new JButton("=");
		equalbtn.setBounds(150, 290, 60, 50);
		jf.add(equalbtn);
		
		JButton divbtn=new JButton("/");
		divbtn.setBounds(220, 110, 60, 50);
		jf.add(divbtn);
		JButton mulbtn=new JButton("x");
		mulbtn.setBounds(220, 170, 60, 50);
		jf.add(mulbtn);
		JButton minusbtn=new JButton("-");
		minusbtn.setBounds(220, 230, 60, 50);
		jf.add(minusbtn);
		JButton plusbtn=new JButton("+");
		plusbtn.setBounds(220, 290, 60, 50);
		jf.add(plusbtn);
		
		
		JButton clearbtn=new JButton("C");
		clearbtn.setBounds(220, 350, 60, 50);
		jf.add(clearbtn);
		
		
	}
	public static void main(String a[]) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
