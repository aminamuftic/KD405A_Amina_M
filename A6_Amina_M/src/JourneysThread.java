import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class JourneysThread extends Thread{

	private Parser parser;
	private SearchGUI gui;
	
	public JourneysThread(Parser p, SearchGUI g){
		this.parser = p;
		this.gui = g;
	}
	
	public void run() {
		
			gui.textArea.setText(null);
			
			gui.textArea.setText("Loading...");
			
		String searchURL1 = Constants.getURL(gui.txtFrom.getText(),
				gui.txtTo.getText(), 1);
		
		Journeys journeys1 = Parser.getJourneys(searchURL1);
		
		gui.textArea.setText(null);
		
		for (Journey j : journeys1.getJourneys()) {
			gui.textArea.append(j.getStartStation() + "- "
					+ j.getEndStation());
			String time1 = j.getDepDateTime().get(Calendar.HOUR_OF_DAY)
					+ ":" + j.getDepDateTime().get(Calendar.MINUTE);
			gui.textArea.append("Departs " + time1 + " that is in " + j.getTimeToDeparture() + " minutes. And it's " + j.getDepTimeDeviation() + " min late ");
					
			
			
		}
	

}
}