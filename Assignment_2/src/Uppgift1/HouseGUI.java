package Uppgift1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HouseGUI extends JFrame {

	private JPanel contentPane;
    private House[] myHouses;
    
    private ArrayList<House> houseHood = new ArrayList<House>();

    
    
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(6, 6, 511, 296);
				contentPane.add(scrollPane);
				
				
				JTextArea txtrEttHusByggt = new JTextArea();
				scrollPane.setViewportView(txtrEttHusByggt);
				
						
						
						
		txtrEttHusByggt.append("Uppgift 1.2" + "\n");
				
				
				

		House House1 = new House(1995, 300);
		System.out.println("Ett hus byggt år "+ House1.getYearBuilt() + " som är "+ House1.getSize() + " kvm stort.");
		House House2 = new House(2000, 450);
		System.out.println("Ett hus byggt år "+ House2.getYearBuilt() + " som är "+ House2.getSize() + " kvm stort.");
		House House3 = new House(2007, 480);
		System.out.println("Ett hus byggt år "+ House3.getYearBuilt() + " som är "+ House3.getSize() + " kvm stort.");
		
	
			txtrEttHusByggt.append("Ett hus byggt år " + House1.getYearBuilt() + " som är " + House1.getSize() + "kvm stort." + "\n" );
			txtrEttHusByggt.append("Ett hus byggt år " + House2.getYearBuilt() + " som är " + House2.getSize() + "kvm stort." + "\n" );
			txtrEttHusByggt.append("Ett hus byggt år " + House3.getYearBuilt() + " som är " + House3.getSize() + "kvm stort." + "\n" );
		
			txtrEttHusByggt.append("Uppgift 1.3" + "\n");
		myHouses = new House [10];
		
		myHouses[0] = new House(1860, 150);
		myHouses[1] = new House(1910, 170);
		myHouses[2] = new House(1925, 175);
		myHouses[3] = new House(1933, 172);
		myHouses[4] = new House(1861, 188);
		myHouses[5] = new House(1976, 190);
		myHouses[6] = new House(1988, 195);
		myHouses[7] = new House(1990, 205);
		myHouses[8] = new House(2005, 320);
		myHouses[9] = new House(2009, 350);
	
		txtrEttHusByggt.append("Ett hus byggt år  " + myHouses[0].getYearBuilt() + " som är " + myHouses[1].getSize() + "kvm stort." + "\n" );

		for(int i = 0; i < myHouses.length; i++){
			if(myHouses[i]!= null){
			txtrEttHusByggt.append("Ett hus byggt år " + myHouses[i].getYearBuilt() + " som är " + myHouses[i].getSize() + "kvm stort." + "\n" );
			}
			} 
		txtrEttHusByggt.append("Uppgift 1.4" + "\n");
		
ArrayList<House>
houseHood = new ArrayList<House> ( );
int year;
int size;
Random rand = new Random();


for(int i = 0; i < 100; i++){
	int randomSize = rand.nextInt ((2015 - 1800)+ 1) + 1800;;
	int randomYear= rand.nextInt((1000 - 10)+ 1) + 10;
	houseHood.add(new House(randomSize, randomYear));
}

		for(int i = 0; i < 100; i++){
			year = rand.nextInt((2015 - 1800)+ 1) + 1800;
			size = rand.nextInt((1000 - 10)+ 1) + 10;
			houseHood.add(new House(year, size));
		}
		
		for(House house : houseHood){
			house.getYearBuilt();
			house.getSize();
			txtrEttHusByggt.append("Ett hus byggt år " + String.valueOf(house.getYearBuilt()) + " som är " + String.valueOf(house.getSize()) + " kvm stort" + "\n");
		}
		
	}
}




