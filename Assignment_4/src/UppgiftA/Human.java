package UppgiftA;
public class Human {
	
//The human has a dog and a name
	private Dog dog;
	private String name;
	private int counter;
	
	//Constructors
	public Human (String name){
		this.name = name;
	}
	//Methods
	public String getName(){
		return this.name;
	}
	
	public Dog buyDog(String createDog){
		counter = counter + 1;
		dog = new Dog(createDog);
		return this.dog;
		
	}
	
	public String getInfo(){
		String ownDog = " ";
if(counter > 0){
	ownDog = (this.name + " owns the dog " + dog.getName());
}else{
	ownDog = this.name + " has no dog ";
}
		
		return ownDog;
	}

}
