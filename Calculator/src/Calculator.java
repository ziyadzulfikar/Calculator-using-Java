import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	boolean isOperatedClicked=false;
	
	boolean add=false;
	boolean sub=false;
	boolean mult=false;
	boolean div=false;
	
	String oldValue;
	
	JFrame jf;
	JLabel displaylabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton divButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton multiButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton minusButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton plusButton;
	JButton clearButton;
	
	public Calculator() {
		
		jf=new JFrame("Calculator");
		jf.getContentPane().setBackground(Color.DARK_GRAY);
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(500, 100);
		
		displaylabel=new JLabel();
		displaylabel.setBounds(30, 50, 540, 40);
		displaylabel.setBackground(Color.gray);
		displaylabel.setOpaque(true);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setForeground(Color.white);
		
		jf.add(displaylabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
		
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
		eightButton.addActionListener(this);
		
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
		nineButton.addActionListener(this);
		
		jf.add(nineButton);
		
		divButton=new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		divButton.setFont(new Font("Arial", Font.PLAIN, 40));
		divButton.addActionListener(this);
		
		jf.add(divButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
		fourButton.addActionListener(this);
		
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
		fiveButton.addActionListener(this);
		
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
		sixButton.addActionListener(this);
		
		jf.add(sixButton);
		
		multiButton=new JButton("x");
		multiButton.setBounds(330, 230, 80, 80);
		multiButton.setFont(new Font("Arial", Font.PLAIN, 40));
		multiButton.addActionListener(this);
		
		jf.add(multiButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
		oneButton.addActionListener(this);
		
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
		twoButton.addActionListener(this);
		
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
		threeButton.addActionListener(this);
		
		jf.add(threeButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(330, 330, 80, 80);
		minusButton.setFont(new Font("Arial", Font.PLAIN, 40));
		minusButton.addActionListener(this);
		
		jf.add(minusButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
		dotButton.addActionListener(this);
		
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
		zeroButton.addActionListener(this);
		
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(230, 430, 80, 80);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
		equalButton.addActionListener(this);
		
		jf.add(equalButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(330, 430, 80, 80);
		plusButton.setFont(new Font("Arial", Font.PLAIN, 40));
		plusButton.addActionListener(this);
		
		jf.add(plusButton);
		
		clearButton=new JButton("C");
		clearButton.setBounds(430, 430, 80, 80);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 40));
		clearButton.addActionListener(this);
		
		jf.add(clearButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		new Calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		
		if(e.getSource()==sevenButton) 
		{
			if(isOperatedClicked) {
				displaylabel.setText("7");
				isOperatedClicked=false;
			}
			else {
			displaylabel.setText(displaylabel.getText()+"7");
			}
		}
		else if(e.getSource()==eightButton)
		{
			if(isOperatedClicked) {
				displaylabel.setText("8");
				isOperatedClicked=false;
			}
			else {
			displaylabel.setText(displaylabel.getText()+"8");
			}		
		}
		else if(e.getSource()==nineButton) 
		{
			if(isOperatedClicked) {
				displaylabel.setText("9");
				isOperatedClicked=false;
			}
			else {
			displaylabel.setText(displaylabel.getText()+"9");
			}
		}
		else if(e.getSource()==divButton)
		{
			isOperatedClicked=true;
			oldValue=displaylabel.getText();
			displaylabel.setText("/");
			div=true;
		}
		else if(e.getSource()==fourButton)
		{
			if(isOperatedClicked) {
				displaylabel.setText("4");
				isOperatedClicked=false;
			}
			else {
			displaylabel.setText(displaylabel.getText()+"4");
			}		}
		else if(e.getSource()==fiveButton) 
		{
			if(isOperatedClicked) {
				displaylabel.setText("5");
				isOperatedClicked=false;
			}
			else {
			displaylabel.setText(displaylabel.getText()+"5");
			}		}
		else if(e.getSource()==sixButton)
		{
			if(isOperatedClicked) {
				displaylabel.setText("6");
				isOperatedClicked=false;
			}
			else {
			displaylabel.setText(displaylabel.getText()+"6");
			}
		}
		else if(e.getSource()==multiButton)
		{
			isOperatedClicked=true;
			oldValue=displaylabel.getText();
			displaylabel.setText("x");
			mult=true;
		}
		else if(e.getSource()==oneButton) 
		{
			if(isOperatedClicked) {
				displaylabel.setText("1");
				isOperatedClicked=false;
			}
			else {
			displaylabel.setText(displaylabel.getText()+"1");
			}		}
		else if(e.getSource()==twoButton)
		{
			if(isOperatedClicked) {
				displaylabel.setText("2");
				isOperatedClicked=false;
			}
			else {
			displaylabel.setText(displaylabel.getText()+"2");
			}		}
		else if(e.getSource()==threeButton)
		{
			if(isOperatedClicked) {
				displaylabel.setText("3");
				isOperatedClicked=false;
			}
			else {
			displaylabel.setText(displaylabel.getText()+"3");
			}		}
		else if(e.getSource()==minusButton) 
		{
			isOperatedClicked=true;
			oldValue=displaylabel.getText();
			displaylabel.setText("-");
			sub=true;
		}
		else if(e.getSource()==dotButton)
		{
			if(isOperatedClicked) {
				displaylabel.setText(".");
				isOperatedClicked=false;
			}
			else {
			displaylabel.setText(displaylabel.getText()+".");
			}		}
		else if(e.getSource()==zeroButton)
		{
			if(isOperatedClicked) {
				displaylabel.setText("0");
				isOperatedClicked=false;
			}
			else {
			displaylabel.setText(displaylabel.getText()+"0");
			}		
		}
		else if(e.getSource()==equalButton) 
		{
			String newValue=displaylabel.getText();
			
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			float result=0;
			if(add) {
				result=oldValueF+newValueF;
				add=false;
			}
			else if(sub){
				result=oldValueF-newValueF;
				sub=false;
			}
			else if(mult){
				result=oldValueF*newValueF;
				mult=false;
			}
			else if(div){
				result=oldValueF/newValueF;
				div=false;
			}
			displaylabel.setText(result+"");
		}
		else if(e.getSource()==plusButton)
		{
			isOperatedClicked=true;
			oldValue=displaylabel.getText();
			displaylabel.setText("+");
			add=true;
			
		}
		else if(e.getSource()==clearButton)
		{
			displaylabel.setText("");
		}
	}
	
}