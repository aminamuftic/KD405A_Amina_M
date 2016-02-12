package UppgiftA;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Canvas;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HumansAndDogs extends JFrame {

	private JPanel contentPane;
	private JTextField txtHuman;
	private JTextField txtDog;
	private JTextField txtInfo;
	private Human human;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumansAndDogs frame = new HumansAndDogs();
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
	public HumansAndDogs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 333);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtHuman = new JTextField();
		txtHuman.setBounds(98, 68, 130, 26);
		contentPane.add(txtHuman);
		txtHuman.setColumns(10);
		
		txtDog = new JTextField();
		txtDog.setBounds(98, 122, 130, 26);
		contentPane.add(txtDog);
		txtDog.setColumns(10);
		
		JButton btnNewButton = new JButton("New Human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String humanName = txtHuman.getText();
				if(humanName.length() < 3){
					txtInfo.setText("Too short name");
				}else{
				human = new Human (humanName);
				txtInfo.setText("Created " + human.getName());
				}
			}
		});
		btnNewButton.setBounds(264, 68, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buy Dog");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(human == null){
					txtInfo.setText("There is no human");
				}else{
				String dogName = txtDog.getText();
				human.buyDog(dogName);
				txtInfo.setText(human.getName() + " bought the dog " + dogName);
			}
			}
		});
		btnNewButton_1.setBounds(264, 109, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtInfo.setText(human.getInfo());
			}
		});
		btnPrintInfo.setBounds(264, 148, 117, 29);
		contentPane.add(btnPrintInfo);
		
		JLabel lblHumansAndDogs = new JLabel("Humans and Dogs");
		lblHumansAndDogs.setFont(new Font("AppleGothic", Font.PLAIN, 32));
		lblHumansAndDogs.setBounds(98, 6, 340, 40);
		contentPane.add(lblHumansAndDogs);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setFont(new Font("AppleGothic", Font.PLAIN, 15));
		lblInfo.setBounds(34, 200, 61, 16);
		contentPane.add(lblInfo);
		
		txtInfo = new JTextField();
		txtInfo.setBounds(34, 218, 424, 57);
		contentPane.add(txtInfo);
		txtInfo.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(23, 189, 447, 101);
		contentPane.add(panel);
	}
}
