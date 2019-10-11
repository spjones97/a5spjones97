package a5;

public class GoldPlate extends PlateImpl{
	
	public GoldPlate(Sushi contents, double price) throws PlatePriceException {
		super(contents, Color.GOLD, checkPrice(price));
	}
	
	public static double checkPrice(double price) {
		if (5.0 > price) {
			throw new IllegalArgumentException("Price must be greater that 5");
		}
		return price;
	}
}
