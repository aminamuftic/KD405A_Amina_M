
public class TestBike2 {

	public static void main(String[] args) {
		BikeStore bikeStore = new BikeStore();
		
		/**Writes the bikes in the bike store*/	
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
	
		System.out.println(bikeStore.getAllBikes());
	}

}
