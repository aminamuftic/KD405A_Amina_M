package se.mah.amina.muftic.cat;

public class catgarden {
	private ArrayList<Cat> allCats;
	private String name;
	
	public catgarden (String name) {
		this.allCats = new ArrayList<Cat>();
		this.name = name;
	}
	
	public void addCat (Cat c){
		if ( allCats.size()<101){
			this.allCats.add(c);
		}
	}



}
