import java.util.ArrayList;
import java.util.Random;

public class TestBike {

	public static void main(String[] args) {
		ArrayList<Bike> Bikelist = new ArrayList<Bike>();
		Random rand = new Random();
		String randomColor = rand.toString();
		int randomSize = rand.nextInt();
		int randomPrice = rand.nextInt();

		System.out.println("Detta är en test för Bike");
		System.out.println("**Start Test");
		//Bike c = new Bike();
		//Bike a = new Bike();
		//System.out.println("One Bike: "+ c.getColor()+" and one: "+ a.getColor());
		System.out.println("**End Test");
		
		Bikelist.add(new Bike("red", 16, 7000));
		Bikelist.add(new Bike("blue", 17, 8000));
		Bikelist.add(new Bike("yellow", 16, 9000));
		Bikelist.add(new Bike("green", 18, 600));
		Bikelist.add(new Bike("purple", 19, 500));
		Bikelist.add(new Bike("gray", 20, 900));
		Bikelist.add(new Bike("black", 24, 1200));
		Bikelist.add(new Bike("white", 26, 1500));
		Bikelist.add(new Bike("pink", 27, 950));
		Bikelist.add(new Bike("lightblue", 26, 7590));
	

	for(int i = 0;i<10;i++){
		Bike b = Bikelist.get(i);	
	
	System.out.println("One Bike: "+ b.getColor()+"  "+ b.getSize()+" "+ b.getPrice());

	}
	}
}