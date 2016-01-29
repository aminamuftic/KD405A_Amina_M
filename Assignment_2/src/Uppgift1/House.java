package Uppgift1;

public class House {
	
		private int yearBuilt;
		private int size;
		private int minSize = 10;
		private int maxSize = 1000;
		private int minYearBuilt = 1800;
		private final int maxYearBuilt = 2015;
		
		public House(int yearBuilt,int size){
			 
			 if(yearBuilt > minYearBuilt){
				 this.yearBuilt = yearBuilt;
			 }else{
				 this.yearBuilt = minYearBuilt;
			 }
				 if(size > minSize){
					 this.size = size;
				 }else{
					 this.size = minSize;
				}
		
		}
	
		
		public int getYearBuilt(){
			return this.yearBuilt;
		}
		
		public int getSize(){
			return this.size;
		}
		

		

}

