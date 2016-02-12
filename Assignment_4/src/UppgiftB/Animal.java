package UppgiftB;

public abstract class Animal {
	/**Creates the class Animal*/
	protected String latinName;
	protected String friendlyName;
	
	/**Creates the latin name*/
	public Animal (String latinName){
		this.latinName = latinName;
	}
	/**gets info*/
	public abstract String getInfo();
	
	public String setFriendlyName(String name){
		return this.friendlyName;
	}
	
	public String getFriendlyName(){
		return this.friendlyName;
	}
	
}


