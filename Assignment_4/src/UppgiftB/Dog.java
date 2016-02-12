package UppgiftB;

public class Dog extends Mammal{
	
	private boolean stupid;
	/**Creates the class dog and takes latin name and gestationtime from the superclass mammal*/
	public Dog (String latinName, int gestationTime, boolean Stupid){
		super (latinName, gestationTime);
		this.stupid = stupid;
	}
	/**Creates the class dog and takes latin name and gestationtime from the superclass mammal and adds a friendly name and boolean stupid*/
	public Dog (String latinName, int gestationTime, boolean Stupid, String friendlyName){
		super (latinName, gestationTime);
		this.stupid = stupid;
		this.friendlyName = friendlyName;
		}
	
	public boolean isStupid(){
		return this.stupid;
	}

	/**writes the dog info*/
	@Override
	public String getInfo() {
		String dogInfo = "";
		dogInfo += "Latin name is " + this.latinName + " nurses for " + this.gestationTime + " months " + " and is ";
		if(this.stupid){
			dogInfo += "stupid";
		}else{
			dogInfo += "not stupid";
		}
		// + this.stupid + this.friendlyName;
		
		return dogInfo;
	}
	

}


