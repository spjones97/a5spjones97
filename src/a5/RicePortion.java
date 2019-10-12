package a5;

// Create Rice Portion class
public class RicePortion extends IngredientPortionImpl{

	public RicePortion (double _amount) {
		super(new Rice(), _amount);
	}
}
