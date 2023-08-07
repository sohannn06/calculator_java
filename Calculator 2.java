package calculator;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import org.w3c.dom.Text;

import java.awt.Rectangle;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.ButtonGroup;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.GREEN);
		frame.setBackground(Color.BLACK);
		frame.getContentPane().setBounds(new Rectangle(5, 10, 10, 10));
		frame.setFont(new Font("Dubai", Font.PLAIN, 24));
		frame.setForeground(Color.BLACK);
		frame.setBounds(100, 100, 391, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific calculator");
		lblNewLabel.setBounds(0, 0, 369, 39);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Dubai", Font.BOLD, 23));
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(0, 50, 369, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setBounds(20, 328, 59, 59);
		frame.getContentPane().add(btnPercent);
		
		JButton btnNewButton_9_2 = new JButton("Sinh");
		btnNewButton_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_9_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_9_2.setBounds(20, 269, 59, 59);
		frame.getContentPane().add(btnNewButton_9_2);
		
		JButton btnNewButton_9_2_1_1 = new JButton("\u221A");
		btnNewButton_9_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_9_2_1_1.setBounds(20, 389, 59, 59);
		frame.getContentPane().add(btnNewButton_9_2_1_1);
		
		JButton btnNewButton_9_1_1_1 = new JButton("x^3");
		btnNewButton_9_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_9_1_1_1.setBounds(20, 448, 59, 59);
		frame.getContentPane().add(btnNewButton_9_1_1_1);
		
		JButton btnNewButton_9_2_2 = new JButton("x^2");
		btnNewButton_9_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_9_2_2.setBounds(20, 509, 59, 59);
		frame.getContentPane().add(btnNewButton_9_2_2);
		
		JButton btnNewButton_9_1_2 = new JButton("n!\r\n");
		btnNewButton_9_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			
			}});
		btnNewButton_9_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_9_1_2.setBounds(20, 568, 59, 59);
		frame.getContentPane().add(btnNewButton_9_1_2);
		
		JButton btnNewButton_9_2_1 = new JButton("Sin");
		btnNewButton_9_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_9_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_9_2_1.setBounds(89, 268, 59, 59);
		frame.getContentPane().add(btnNewButton_9_2_1);
		
		JButton btnNewButton_9_1_1 = new JButton("Log");
		btnNewButton_9_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_9_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_9_1_1.setBounds(89, 328, 59, 59);
		frame.getContentPane().add(btnNewButton_9_1_1);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setSize(new Dimension(10, 10));
		btn7.setForeground(Color.BLACK);
		btn7.setBounds(89, 386, 59, 59);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setSize(new Dimension(10, 10));
		btn4.setForeground(Color.BLACK);
		btn4.setBounds(89, 448, 59, 59);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setSize(new Dimension(10, 10));
		btn1.setForeground(Color.BLACK);
		btn1.setBounds(89, 509, 59, 59);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setSize(new Dimension(10, 10));
		btn0.setForeground(Color.BLACK);
		btn0.setBounds(89, 568, 128, 59);
		frame.getContentPane().add(btn0);
		
		JButton btnNewButton_9_1_3 = new JButton("Cosh");
		btnNewButton_9_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_9_1_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_9_1_3.setBounds(158, 328, 59, 59);
		frame.getContentPane().add(btnNewButton_9_1_3);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setSize(new Dimension(10, 10));
		btn8.setForeground(Color.BLACK);
		btn8.setBounds(158, 389, 59, 59);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setSize(new Dimension(10, 10));
		btn5.setForeground(Color.BLACK);
		btn5.setBounds(158, 448, 59, 59);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setSize(new Dimension(10, 10));
		btn2.setForeground(Color.BLACK);
		btn2.setBounds(158, 509, 59, 59);
		frame.getContentPane().add(btn2);
		
		JButton btnNewButton_9_1_4 = new JButton("Tanh");
		btnNewButton_9_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
			
		});
		btnNewButton_9_1_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_9_1_4.setBounds(227, 328, 59, 59);
		frame.getContentPane().add(btnNewButton_9_1_4);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setSize(new Dimension(10, 10));
		btn9.setForeground(Color.BLACK);
		btn9.setBounds(227, 389, 59, 59);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setSize(new Dimension(10, 10));
		btn6.setForeground(Color.BLACK);
		btn6.setBounds(227, 448, 59, 59);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setSize(new Dimension(10, 10));
		btn3.setForeground(Color.BLACK);
		btn3.setBounds(227, 509, 59, 59);
		frame.getContentPane().add(btn3);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		btnAdd.setBounds(296, 269, 59, 59);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(296, 328, 59, 59);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMul.setBounds(296, 389, 59, 59);
		frame.getContentPane().add(btnMul);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivide.setForeground(Color.BLACK);
		btnDivide.setBounds(296, 448, 59, 59);
		frame.getContentPane().add(btnDivide);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second =Double.parseDouble(textField.getText());
				
				if (operation=="+") {
					result= first+second;
					answer=String.format("%.2f ",result);
					textField.setText(answer);
					
				}
				else if (operation=="-") {
					result= first-second;
					answer=String.format("%.2f ",result);
					textField.setText(answer);
					
				}
				else if (operation=="*") {
					result= first*second;
					answer=String.format("%.2f ",result);
					textField.setText(answer);
					
				}
				else if (operation=="/") {
					result= first/second;
					answer=String.format("%.2f ",result);
					textField.setText(answer);
					
				}
				
				else if (operation=="%") {
					result= first%second;
					answer=String.format("%.2f ",result);
					textField.setText(answer);
					
				}
			}
			
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnEqual.setBounds(296, 509, 59, 118);
		frame.getContentPane().add(btnEqual);
		
		JButton btnNewButton_1 = new JButton("e^x");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1.setBounds(116, 182, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str= new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace =str.toString();
					textField.setText(backspace);
					
					
				}
			}
		});
		btnBackSpace.setForeground(new Color(0, 0, 128));
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 14));
		btnBackSpace.setBounds(20, 182, 89, 23);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnNewButton_1_2 = new JButton("1/x");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_2.setBounds(219, 182, 89, 23);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				
			}
		});
		btnClear.setForeground(Color.BLUE);
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClear.setBounds(318, 160, 47, 45);
		frame.getContentPane().add(btnClear);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setSize(new Dimension(10, 10));
		btnDot.setForeground(Color.BLACK);
		btnDot.setBounds(227, 568, 59, 59);
		frame.getContentPane().add(btnDot);
		
		JButton btnNewButton_9_2_1_2 = new JButton("Cos");
		btnNewButton_9_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_9_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_9_2_1_2.setBounds(158, 269, 59, 59);
		frame.getContentPane().add(btnNewButton_9_2_1_2);
		
		JButton btnNewButton_9_2_1_3 = new JButton("Tan");
		btnNewButton_9_2_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_9_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_9_2_1_3.setBounds(227, 269, 59, 59);
		frame.getContentPane().add(btnNewButton_9_2_1_3);
	}
}
