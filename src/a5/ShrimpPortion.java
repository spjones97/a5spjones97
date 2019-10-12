package a4;

// Create Shrimp Portion class
public class ShrimpPortion extends IngredientPortionImpl{

	public ShrimpPortion(double _amount) {
		super(new Shrimp(), _amount);
	}
}
