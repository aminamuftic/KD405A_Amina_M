package UppgiftB;

public abstract class Mammal extends Animal {

	protected int gestationTime;

	
	public Mammal (String latinName, int gestationTime){
		super(latinName);
		this.gestationTime = gestationTime;
	}
	
	public int getGestationtime(){
		return this.gestationTime;
	}

}


