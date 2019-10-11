package a5;

// Create Green Plate class
public class GreenPlate extends PlateImpl{
	
	public GreenPlate(Sushi contents) throws PlatePriceException {
		super(contents, Color.GREEN, 2.0);
	}
}
