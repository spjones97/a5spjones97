package a5;

// Create Shrimp class
public class Shrimp extends IngredientImpl {

	public Shrimp() {
		super("shrimp", 0.65, 32);
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
