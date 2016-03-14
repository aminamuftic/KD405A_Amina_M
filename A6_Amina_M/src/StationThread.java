import java.util.ArrayList;

import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class StationThread extends Thread{

	private Parser parser;
	private SearchGUI gui;
	
	public StationThread(Parser p, SearchGUI g){
		this.parser = p;
		this.gui = g;
	}
	
	public void run() {
		gui.txtrResult.setText(null);
		
		gui.txtrResult.setText("Loading...");
		
		ArrayList<Station> searchStation = new ArrayList <Station>();
		
		searchStation.addAll(Parser.getStationsFromURL(gui.textField.getText()));
		
		gui.txtrResult.setText(null);
		
		for (Station s : searchStation) {
			gui.txtrResult.append(s.getStationName() + "number:"
					+ s.getStationNbr() + "latitude: " + s.getLatitude()
					+ "longitude:" + s.getLongitude() + "\n");
		}
		
	}

}
