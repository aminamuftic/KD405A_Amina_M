package UppgiftB;

import java.util.ArrayList;

public class TestAnimal {


	public static void main(String[] args) {
		Dog dog = new Dog("Lisa", 5, true, "friendlyName");
		System.out.println(dog.getInfo());	
		
		Cat cat = new Cat("Molly", 5, 8);
		System.out.println(cat.getInfo());
		
		Snake snake = new Snake("Pelle", true);
		System.out.println(snake.getInfo());
		Snake snaky = new Snake("Kalle", false);
		System.out.println(snaky.getInfo());
		
		ArrayList<Animal>
		Animallist = new ArrayList<Animal> ( );
		Animallist.add(new Dog("Klara", 5, true, "friendlyName"));
		Animallist.add(new Cat("Maja", 5, 9));
		Animallist.add(new Snake("Karl", true));
		for(int i = 0; i < Animallist.size(); i++){
			System.out.println(Animallist.get(i).getInfo());
			
		}
	}

}
