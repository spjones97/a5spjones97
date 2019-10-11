package a5;

public class Tuna extends IngredientImpl {
	
	public Tuna() {
		super("tuna", 1.67, 42);
	}

	public boolean getIsRice() {
		return false;
	}
	
	public boolean getIsVegetarian() {
		return false;
	}

	public boolean getIsShellfish() {
		return false;
	}
}
