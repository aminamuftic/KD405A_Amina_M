package UppgiftB;

public class Snake extends Animal{

	private boolean poisonus;
	private String snakeFriendlyName = "noname";
	
	public Snake (String latinName, boolean poisonus){
		super(latinName);
		this.poisonus = poisonus;
	}
	
	public boolean isPoisonus(){
		return this.poisonus;
	}
	
	/**writes the snake info*/
	@Override
	public String getInfo() {
		String snakeInfo = "";
		
		if(this.getFriendlyName() != null){
			snakeFriendlyName = this.getFriendlyName();	
			}
		snakeInfo += "The snake named " + snakeFriendlyName + " lat: " + this.latinName + " and is " ;	
		if(this.poisonus){
			snakeInfo += "poisonus";
		}else{
			snakeInfo += "not poisonus";
		}
		
		return snakeInfo;
	}
	

}

