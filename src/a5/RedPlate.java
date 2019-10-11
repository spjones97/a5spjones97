package a5;

public class RedPlate extends PlateImpl{
	
	public RedPlate(Sushi contents) throws PlatePriceException{
		
		super(contents, Color.RED, 1.0);
	}
}
