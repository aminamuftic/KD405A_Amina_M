
public class Constants {
	
/**Creates constants for min/max sizes, min/max prices and color*/
	

	public static final int MIN_SIZE = 8;
	public static final int MAX_SIZE = 28;
	public static final int MIN_PRICE = 0;
	public static final int MAX_PRICE = 30000;
	public static final int maxNumberOfBikes = 20;
	public static final String[] bikeColors = new String[]{
			"red","blue", "yellow", "green", "purple", "gray", "black", "white", "pink", "lightblue"};
	
	/**The minimum size of the bikes*/
	public static final int getMinSize(){
		return MIN_SIZE;
	}
	/**The maximum size of the bikes*/
	public static final int getMaxSize(){
		return MAX_SIZE;
	}
	/**The minimum price of the bikes*/
	public static final int getMinPrice(){
		return MIN_PRICE;
	}
	/**The maximum price of the bikes*/
	public static final int getMaxPrice(){
		return MAX_PRICE;
	}
	/**Colors of the bike*/
	public static final String[] getBikeColors(){
		return bikeColors;
	}
	
	



}


