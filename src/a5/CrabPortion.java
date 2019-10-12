package a5;

// Create Crab Portion class
public class CrabPortion extends IngredientPortionImpl{

	public CrabPortion(double _amount) {
		super (new Crab(), _amount);
	}
}
