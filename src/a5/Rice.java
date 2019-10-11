package a5;

// Create Rice class
public class Rice extends IngredientImpl {

	public Rice() {
		super("rice", .13, 34);
	}
	
	public boolean getIsRice() {
		return true;
	}
	
	public boolean getIsVegetarian() {
		return true;
	}
	
	public boolean getIsShellfish() {
		return false;
	}
}
