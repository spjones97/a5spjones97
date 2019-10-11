package a5;

// Create Red Plate class
public class RedPlate extends PlateImpl{
	
	public RedPlate(Sushi contents) throws PlatePriceException{
		
		super(contents, Color.RED, 1.0);
	}
}
