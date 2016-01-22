package se.mah.KD405A;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.ListSelectionModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.border.CompoundBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;
import javax.swing.Box;
import java.awt.Canvas;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class medlemsregister extends JFrame {

	private JPanel contentPane;
	private JTextField txtHejhejhej;
	private JTextField txtNamnJasmineAli;
	private JTextField txtPersonnumer;
	private JTextField txtAdressNordenskildgatan;
	private JTextField txtTelefon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					medlemsregister frame = new medlemsregister();
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
	public medlemsregister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 371);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(332, 45, 157, 230);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Jasmine Ali", "Emil Andersson", "Klara Bengtsson", "Lina Ceder", "Emil Degrén", "Hans Doberg", "Erik Ek", "Ena Fredic", "Gustav Gustafsson", "Nicklas Ivarsson", "Tom Jacobsen", "Lara Karlsson", "Nils Nillson", "Per Persson", "Ida Svan", "Nils Tomsson", "Pontus Unt", "Mina Vansson", "Joey Ylv", "James Zoney"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		txtNamnJasmineAli = new JTextField();
		txtNamnJasmineAli.setBounds(97, 45, 130, 26);
		txtNamnJasmineAli.setText("Namn: Jasmine Ali");
		contentPane.add(txtNamnJasmineAli);
		txtNamnJasmineAli.setColumns(10);
		
		txtPersonnumer = new JTextField();
		txtPersonnumer.setBounds(16, 83, 211, 26);
		txtPersonnumer.setText("Personnumer: 890121-8797");
		contentPane.add(txtPersonnumer);
		txtPersonnumer.setColumns(10);
		
		txtAdressNordenskildgatan = new JTextField();
		txtAdressNordenskildgatan.setBounds(16, 121, 211, 26);
		txtAdressNordenskildgatan.setText("Adress: Nordenskiöldgatan 6");
		contentPane.add(txtAdressNordenskildgatan);
		txtAdressNordenskildgatan.setColumns(10);
		
		txtTelefon = new JTextField();
		txtTelefon.setBounds(16, 197, 211, 26);
		txtTelefon.setText("Telefon: 0738936285");
		contentPane.add(txtTelefon);
		txtTelefon.setColumns(10);
		
		txtHejhejhej = new JTextField();
		txtHejhejhej.setBounds(16, 159, 211, 26);
		txtHejhejhej.setText("E-post: jasmineali@gmail.com");
		contentPane.add(txtHejhejhej);
		txtHejhejhej.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(35, 21, 50, 50);
		label_1.setIcon(new ImageIcon(medlemsregister.class.getResource("/se/mah/KD405A/main-thumb-38273494-50-httxhkudqamynsywrvrumejwavvskwuy.jpg")));
		contentPane.add(label_1);
		
		JButton btnFinish = new JButton("Spara");
		btnFinish.setBounds(413, 299, 102, 20);
		contentPane.add(btnFinish);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 532, 327);
		label.setIcon(new ImageIcon(medlemsregister.class.getResource("/se/mah/KD405A/fitness24seven_huvudsta_0675.jpg")));
		contentPane.add(label);
	}
}
