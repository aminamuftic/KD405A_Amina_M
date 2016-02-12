package UppgiftB;

public class Cat extends Mammal{
	
	private int numberOfLifes;
	String catFriendlyName = "noname";
	
	public Cat(String latinName, int gestationTime, int numberOfLifes){
		super (latinName, gestationTime);
		this.numberOfLifes = numberOfLifes;
	}
	
	public int getNumberOfLifes(){
		return this.numberOfLifes;
	}

	public int setNumberOfLifes(int i){
		return this.numberOfLifes;
	}
	/**writes the cat info*/
	@Override
	public String getInfo() {
		
		String catInfo = "";
		
		if(this.getFriendlyName() != null){
		catFriendlyName = this.getFriendlyName();	
		}
		
		catInfo += "The cat " + catFriendlyName + " lat: " +  this.latinName + " nurses for " + this.gestationTime + " months " + " and has " + this.getNumberOfLifes() + " lifes. ";
		
		// + this.stupid + this.friendlyName;
		
		return catInfo;
	}
	
	

}
