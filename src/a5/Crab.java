package a5;

// Create Crab class
public class Crab extends IngredientImpl {

	public Crab() {
		super("crab", 0.72, 37);
	}
	
	public boolean getIsRice() {
		return false;
	}
	public boolean getIsVegetarian() {
		return false;
	}
	public boolean getIsShellfish() {
		return true;
	}
}
