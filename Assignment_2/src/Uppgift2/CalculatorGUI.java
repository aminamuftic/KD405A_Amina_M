package Uppgift2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private int Calculator;
	Calculator myCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public CalculatorGUI() {
		myCalculator = new Calculator();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(26, 6, 480, 103);
		contentPane.add(textArea);
		
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("1");
				myCalculator.numberButtonPressed(1);
			}
		});
		button.setBounds(6, 165, 117, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("2");
				myCalculator.numberButtonPressed(2);
			}
		});
		button_1.setBounds(125, 165, 117, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("3");
				myCalculator.numberButtonPressed(3);
			}
		});
		button_2.setBounds(254, 165, 117, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("4");
				myCalculator.numberButtonPressed(4);
			}
		});
		button_3.setBounds(6, 206, 117, 29);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("5");
				myCalculator.numberButtonPressed(5);
			}
		});
		button_4.setBounds(125, 206, 117, 29);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("6");
				myCalculator.numberButtonPressed(6);
			}
		});
		button_5.setBounds(254, 206, 117, 29);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("7");
				myCalculator.numberButtonPressed(7);
			}
		});
		button_6.setBounds(6, 241, 117, 29);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("8");
				myCalculator.numberButtonPressed(8);
			}
		});
		button_7.setBounds(125, 241, 117, 29);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("9");
				myCalculator.numberButtonPressed(9);
			}
		});
		button_8.setBounds(254, 241, 117, 29);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("0");
				myCalculator.numberButtonPressed(0);
			}
		});
		button_9.setBounds(125, 282, 117, 29);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("+");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("+");
				myCalculator.plus();
			}
		});
		button_10.setBounds(393, 165, 117, 29);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("-");
				myCalculator.minus();
			}
		});
		button_11.setBounds(393, 206, 117, 29);
		contentPane.add(button_11);
		
		JButton button_13 = new JButton("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("*");
				myCalculator.mult();
			}
		});
		button_13.setBounds(393, 241, 117, 29);
		contentPane.add(button_13);
		
		JButton button_12 = new JButton("=");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				textArea.setText(String.valueOf(i));
			}
		});
		button_12.setBounds(393, 282, 117, 29);
		contentPane.add(button_12);
	}
}
