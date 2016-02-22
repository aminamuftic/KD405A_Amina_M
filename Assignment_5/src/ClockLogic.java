import java.util.Calendar;

public class ClockLogic {

	private DigitalClockGUI clockGUI;
	private int alarmHour;
	private int alarmMinute;

	
	public ClockLogic (DigitalClockGUI digitalClockGUI){
		this.clockGUI = digitalClockGUI;
		Thread t = new ClockThread();
		t.start();
	}
	
	public void setAlarm (int hours, int minute){
		this.alarmHour = hours;
		this.alarmMinute = minute;
	}
	
	public void clearAlarm(){
		this.alarmHour = -1;
		this.alarmMinute = -1;
	}
	
	public static String fixTime(int i){
		String s = String.valueOf(i);
		if (s.length()==1){
			s="0"+s;
		}
		return s;
		}
	
	private class ClockThread extends Thread{
		@Override 
		public void run(){
			while (true){
			Calendar c = Calendar.getInstance();
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int min = c.get(Calendar.MINUTE);
			int sec = c.get(Calendar.SECOND);
			clockGUI.setTimeOnLabel(fixTime (hour)+ ":" +fixTime(min)+":" +fixTime(sec));
			if(hour==alarmHour&&min==alarmMinute){
				clockGUI.activateAlarm(true);
			}
			
			
			try {
				Thread.sleep(900);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	}
}
		



