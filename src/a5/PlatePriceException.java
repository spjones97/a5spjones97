package a5;

// Create Plate Price Exception class
public class PlatePriceException extends Exception{
	
	private double price;
	

	public double getIllegalPrice() {
		return price;
	}
	public PlatePriceException(String string) {
		super("Price cannot be below zero");
	}
	public String getMessage() {
		return super.getMessage() + "price";
	}
}
