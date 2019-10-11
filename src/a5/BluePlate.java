package a5;

public class BluePlate extends PlateImpl{

	public BluePlate(Sushi contents) throws PlatePriceException {
		
		super(contents, Color.BLUE, 4.0);
	}
}
