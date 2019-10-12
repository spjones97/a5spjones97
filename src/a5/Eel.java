package a5;

// Create Eel class
public class Eel extends IngredientImpl {
	
	public Eel() {
		super("eel", 2.15, 82);
	}
	
	public boolean getIsRice() {
		return false;
	}
	public boolean getIsVegetarian() { return false; }
	public boolean getIsShellfish() { return false; }
	
}
