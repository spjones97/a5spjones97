package a4;

// Create Seaweed class
public class Seaweed extends IngredientImpl {

	public Seaweed() {
		super("seaweed", 2.85, 105);
	}

	@Override
	public boolean getIsRice() {
		return false;
	}

	@Override
	public boolean getIsVegetarian() {
		return true;
	}

	@Override
	public boolean getIsShellfish() {
		return false;
	}
}
