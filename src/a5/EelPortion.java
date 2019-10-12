package a4;

// Create Eel Portion class
public class EelPortion extends IngredientPortionImpl{

	public EelPortion(double _amount) {
		super(new Eel(), _amount);
	}
}
