import java.awt.BorderLayout;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class DigitalClockGUI extends JFrame {

	private ClockLogic clockLogic;
	
	private JPanel contentPane;
	private JTextField txtHour;
	private JTextField txtMinute;
	private JLabel lblHour;
	private JLabel lblMinute;
	private JTextField txtClock;
	private JTextField txtTimeSet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 302);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblHour = new JLabel("Hour:");
		lblHour.setFont(new Font("Malayalam MN", Font.PLAIN, 14));
		lblHour.setBounds(361, 41, 61, 16);
		contentPane.add(lblHour);
		
		lblMinute = new JLabel("Minute:");
		lblMinute.setFont(new Font("Malayalam Sangam MN", Font.PLAIN, 14));
		lblMinute.setBounds(361, 89, 61, 16);
		contentPane.add(lblMinute);
		
		txtHour = new JTextField();
		txtHour.setBounds(415, 36, 74, 26);
		contentPane.add(txtHour);
		txtHour.setColumns(10);
		
		txtMinute = new JTextField();
		txtMinute.setBounds(415, 84, 74, 26);
		contentPane.add(txtMinute);
		txtMinute.setColumns(10);
		
		JButton btnSetAlarm = new JButton("Set Alarm");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alarmHourString = txtHour.getText();
				String alarmMinuteString = txtMinute.getText();
				txtTimeSet.setText("Alarm set at: " + clockLogic.fixTime(Integer.parseInt(alarmHourString)) + ":" + clockLogic.fixTime(Integer.parseInt(alarmMinuteString)));
				clockLogic.setAlarm(Integer.parseInt(alarmHourString), Integer.parseInt(alarmMinuteString));
				
			}
		});
		btnSetAlarm.setBounds(371, 122, 117, 29);
		contentPane.add(btnSetAlarm);
		
		JButton btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clockLogic.clearAlarm();
				contentPane.setBackground(Color.PINK);
				txtTimeSet.setText("Alarm Cleared");
				
			}
		});
		btnClearAlarm.setBounds(372, 198, 117, 29);
		contentPane.add(btnClearAlarm);
		
		txtClock = new JTextField();
		txtClock.setFont(new Font("Malayalam MN", Font.PLAIN, 17));
		txtClock.setEditable(false);
		txtClock.setBounds(100, 151, 170, 26);
		contentPane.add(txtClock);
		txtClock.setColumns(10);
		
		txtTimeSet = new JTextField();
		txtTimeSet.setFont(new Font("Malayalam MN", Font.PLAIN, 17));
		txtTimeSet.setEditable(false);
		txtTimeSet.setBounds(100, 222, 170, 26);
		contentPane.add(txtTimeSet);
		txtTimeSet.setColumns(10);
		
		
		JLabel lblAlarmClock = new JLabel("Alarm Clock");
		lblAlarmClock.setFont(new Font("Noteworthy", Font.PLAIN, 37));
		lblAlarmClock.setBounds(83, 4, 210, 63);
		contentPane.add(lblAlarmClock);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Malayalam MN", Font.PLAIN, 15));
		lblTime.setBounds(154, 131, 61, 16);
		contentPane.add(lblTime);
		
		JLabel lblAlarm = new JLabel("Alarm");
		lblAlarm.setFont(new Font("Malayalam MN", Font.PLAIN, 15));
		lblAlarm.setBounds(154, 204, 61, 16);
		contentPane.add(lblAlarm);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-fewer-details@2x.png")));
		lblNewLabel.setBounds(177, 55, 52, 50);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-more-details@2x.png")));
		label.setBounds(126, 58, 62, 47);
		contentPane.add(label);
		
		clockLogic = new ClockLogic(this);
	}
	
	public void setTimeOnLabel (String time){
		txtClock.setText(time);
		
	}
	public void activateAlarm(boolean activate){
		contentPane.setBackground(Color.BLUE);
	}
}
