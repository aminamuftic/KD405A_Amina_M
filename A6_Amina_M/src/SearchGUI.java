import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class SearchGUI extends JFrame {

	private JPanel contentPane;
	JTextField textField  = new JTextField();
	JTextField txtFrom= new JTextField();
	SearchGUI g = this;
	Parser p = new Parser();
	JTextArea txtrResult = new JTextArea();
	JTextField txtTo= new JTextField();
	JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchGUI frame = new SearchGUI();
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
	public SearchGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 314);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 274, 292);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		textField.setBounds(57, 46, 130, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnSk = new JButton("Sök");
		btnSk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread s1 = new StationThread (p, g);
				s1.start();
			}
		});
		btnSk.setBounds(57, 84, 117, 29);
		panel.add(btnSk);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 139, 274, 153);
		panel.add(scrollPane);
		scrollPane.setViewportView(txtrResult);
		
		
		txtrResult.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblSkStation = new JLabel("Sök station:");
		lblSkStation.setBounds(80, 30, 86, 16);
		panel.add(lblSkStation);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(278, 0, 266, 292);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		txtTo.setBounds(65, 60, 130, 26);
		panel_1.add(txtTo);
		txtTo.setColumns(10);
		
		
		txtFrom.setBounds(65, 22, 130, 26);
		panel_1.add(txtFrom);
		txtFrom.setColumns(10);
		
		JButton btnSk_1 = new JButton("sök");
		btnSk_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread s2 = new JourneysThread (p, g);
				s2.start();
			}
		});
		btnSk_1.setBounds(57, 98, 117, 29);
		panel_1.add(btnSk_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 139, 266, 153);
		panel_1.add(scrollPane_1);
		textArea.setBackground(Color.LIGHT_GRAY);
		scrollPane_1.setViewportView(textArea);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setBounds(21, 27, 61, 16);
		panel_1.add(lblFrom);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setBounds(21, 65, 61, 16);
		panel_1.add(lblTo);
	}
}
