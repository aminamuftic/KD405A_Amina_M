import java.util.ArrayList;

public class BikeStore {
	/**Creates my bike store*/
	private ArrayList <Bike> Bikes = new ArrayList <Bike>();
	
	public String getAllBikes(){
		String bikeString = new String();
		for(Bike bikeloop: Bikes){
			bikeString = bikeString + "A " + bikeloop.getColor() + " bike " + "in size " + bikeloop.getSize() + " that costs " + bikeloop.getPrice() + " kr. " + "\n"; 
		}
		return bikeString;
	}
	
	public void addBike(String color, int size, int price) {
		Bikes.add(new Bike(color, size, price));
	}

	

}