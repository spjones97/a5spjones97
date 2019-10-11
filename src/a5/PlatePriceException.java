package a5;

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
