import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Font;

public class BikeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtTxtcolor;
	private JTextField txtTxtsize;
	private JTextField txtTxtprice;
	private JButton btnNewButton;
	BikeStore bikeStore = new BikeStore();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeGUI frame = new BikeGUI();
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
	public BikeGUI() {
		bikeStore.addBike("green", 26, 700);
		bikeStore.addBike("red", 27, 800);
		bikeStore.addBike("blue", 26, 900);
		bikeStore.addBike("gray", 28, 6000);
		bikeStore.addBike("pink", 29, 5000);
		bikeStore.addBike("purple", 19, 9000);
		bikeStore.addBike("white", 16, 120);
		bikeStore.addBike("black", 18, 150);
		bikeStore.addBike("lightblue", 17, 950);
		bikeStore.addBike("lightgreen", 16, 7590);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 318);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrTextarea = new JTextArea();
		txtrTextarea.setBounds(18, 17, 293, 266);
		contentPane.add(txtrTextarea);
		
		txtTxtcolor = new JTextField();
		txtTxtcolor.setBounds(380, 54, 130, 26);
		contentPane.add(txtTxtcolor);
		txtTxtcolor.setColumns(10);
		
		txtTxtsize = new JTextField();
		txtTxtsize.setBounds(380, 92, 130, 26);
		contentPane.add(txtTxtsize);
		txtTxtsize.setColumns(10);
		
		txtTxtprice = new JTextField();
		txtTxtprice.setBounds(380, 130, 130, 26);
		contentPane.add(txtTxtprice);
		txtTxtprice.setColumns(10);
		
		btnNewButton = new JButton("Add Bike");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**Sets the size and price to int*/
				int size;
				int price;
				size = Integer.parseInt(txtTxtsize.getText());
				price = Integer.parseInt(txtTxtprice.getText());
				bikeStore.addBike(txtTxtcolor.getText(), size, price);
				txtrTextarea.setText(bikeStore.getAllBikes());	
			}
			
		});
		btnNewButton.setBounds(393, 178, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblBikeStore = new JLabel("Bike Store");
		lblBikeStore.setFont(new Font("Malayalam MN", Font.PLAIN, 20));
		lblBikeStore.setBounds(370, 6, 130, 36);
		contentPane.add(lblBikeStore);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setFont(new Font("Malayalam MN", Font.PLAIN, 14));
		lblColor.setBounds(323, 60, 61, 16);
		contentPane.add(lblColor);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setFont(new Font("Malayalam MN", Font.PLAIN, 14));
		lblSize.setBounds(323, 98, 61, 16);
		contentPane.add(lblSize);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Malayalam MN", Font.PLAIN, 14));
		lblPrice.setBounds(323, 130, 61, 16);
		contentPane.add(lblPrice);
	}
}
