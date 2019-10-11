package a5;

// Create Tuna Portion class
public class TunaPortion extends IngredientPortionImpl {
	
	public TunaPortion(double _amount) {
		super(new Tuna(), _amount);
	}

}
