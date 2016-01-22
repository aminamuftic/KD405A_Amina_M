package se.mah.KD405A;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField txtJasmineAli;
	private JTextField textField;
	private JTextField txtNordenskildgatan;
	private JTextField txtJasminealigmailcom;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 363);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkriv = new JMenuItem("Skriv ut");
		mnArkiv.add(mntmSkriv);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnNewMenu = new JMenu("Medlem");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnNewMenu.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnNewMenu.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hjälp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hjälp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Main.class.getResource("/se/mah/KD405A/avatar_a8de4a4306a6_128.png")));
		label_1.setBounds(22, 13, 130, 128);
		contentPane.add(label_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(423, 0, 137, 319);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Jasmine Ali", "Emil Andersson", "Klara Bengtsson", "Lina Ceder", "Emil Degrén", "Hans Doberg", "Erik Ek", "Ena Fredic", "Gustav Gustafsson", "Nicklas Ivarsson", "Tom Jacobsen", "Lara Karlsson", "Nils Nillson", "Per Persson", "Ida Svan", "Nils Tomsson", "Pontus Unt", "Mina Vansson", "Joey Ylv", "James Zoney"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		JLabel lblNamn = new JLabel("Namn:");
		lblNamn.setBounds(22, 153, 61, 16);
		contentPane.add(lblNamn);
		
		JLabel lblPersonnummer = new JLabel("Personnummer:");
		lblPersonnummer.setBounds(22, 181, 109, 16);
		contentPane.add(lblPersonnummer);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(22, 209, 61, 16);
		contentPane.add(lblAdress);
		
		JLabel lblTelefonnummer = new JLabel("Telefonnummer:");
		lblTelefonnummer.setBounds(22, 237, 109, 16);
		contentPane.add(lblTelefonnummer);
		
		JLabel lblEpost = new JLabel("E-post:");
		lblEpost.setBounds(22, 265, 61, 16);
		contentPane.add(lblEpost);
		
		txtJasmineAli = new JTextField();
		txtJasmineAli.setText("Jasmine Ali");
		txtJasmineAli.setBounds(70, 148, 185, 26);
		contentPane.add(txtJasmineAli);
		txtJasmineAli.setColumns(10);
		
		textField = new JTextField();
		textField.setText("890121-8797");
		textField.setBounds(125, 176, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtNordenskildgatan = new JTextField();
		txtNordenskildgatan.setText("Nordenskiöldgatan 6");
		txtNordenskildgatan.setBounds(70, 204, 185, 26);
		contentPane.add(txtNordenskildgatan);
		txtNordenskildgatan.setColumns(10);
		
		txtJasminealigmailcom = new JTextField();
		txtJasminealigmailcom.setText("jasmineali@gmail.com");
		txtJasminealigmailcom.setBounds(70, 260, 185, 26);
		contentPane.add(txtJasminealigmailcom);
		txtJasminealigmailcom.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("0738936285\n");
		textField_1.setBounds(125, 232, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Main.class.getResource("/se/mah/KD405A/1362666768.2085.jpg")));
		label.setBounds(0, 0, 422, 319);
		contentPane.add(label);
	}
}
