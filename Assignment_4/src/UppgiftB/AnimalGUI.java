package UppgiftB;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class AnimalGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
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
	/**writes the info in the text area*/
	public AnimalGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 325);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.select"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtAnimals = new JTextArea();
		txtAnimals.setBounds(31, 28, 454, 234);
		contentPane.add(txtAnimals);
		ArrayList<Animal>
		Animallist = new ArrayList<Animal> ( );
		Animallist.add(new Dog("Klara", 5, true, "friendlyName"));
		Animallist.add(new Cat("Maja", 5, 9));
		Animallist.add(new Snake("Karl", true));
		for(int i = 0; i < Animallist.size(); i++){
		txtAnimals.append(Animallist.get(i).getInfo() + "\n");
			
		}
	}

}
