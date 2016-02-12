

	
	

	public class Bike {
		private String color;
		private int size;
		private int price;
	
		
		/**Creates a Bike with instance variables limited by values in Constants.java*/
		
		//Constructors
		public Bike(String color, int size){
			this.color = color;
			this.size = size;
		}
		
		public Bike(String color, int size, int price) {
			this.color = color;
			this.size = size;
			this.price = price;
		}
		
		/**Creates methods like color, size and price*/

		//Methods
		public String getColor(){
			return this.color;
		}
		
		public int getSize(){
			return this.size;
		}
		
		public int getPrice(){
			return this.price;
		}
		
		
		public void setPrice(int price){
				this.price = price;
			}
		
		

	}







