package a5;

// Create Sashimi class
public class Sashimi implements Sushi{
	public enum SashimiType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
	
	protected String ingredientName;
	protected IngredientPortion[] ingredientArr;
	protected IngredientPortion ingredientAmount;
	
	public Sashimi(SashimiType _type) {
		
		ingredientArr = new IngredientPortion[1];
		
		if (_type == SashimiType.TUNA) {
			ingredientName = "tuna sashimi";
			ingredientAmount = new TunaPortion(0.75);
		} else if (_type == SashimiType.YELLOWTAIL) {
			ingredientName = "yellowtail sashimi";
			ingredientAmount = new YellowtailPortion(0.75);
		} else if (_type == SashimiType.EEL) {
			ingredientName = "eel sashimi";
			ingredientAmount = new EelPortion(0.75);
		} else if (_type == SashimiType.CRAB) {
			ingredientName = "crab sashimi";
			ingredientAmount = new CrabPortion(0.75);
		} else if (_type == SashimiType.SHRIMP) {
			ingredientName = "shrimp sashimi";
			ingredientAmount = new ShrimpPortion(0.75);
		}
		ingredientArr[0] = ingredientAmount;
		
		for (int i = 0; i < ingredientArr.length; i++) {
			if (ingredientArr[i] == null) {
				throw new RuntimeException("ingredients array can't be null");
			}
		}
		

	}

	@Override
	public String getName() {
		return ingredientName;
	}

	@Override
	public IngredientPortion[] getIngredients() {
		return ingredientArr;
	}

	@Override
	public int getCalories() {
		double result = 0.0;
		int integer = 0;
		for (int i = 0; i < ingredientArr.length; i++) {
			result = result + ingredientArr[i].getCalories();
		}
		integer = (int)(result + 0.5);
		
		return integer;
	}

	@Override
	public double getCost() {
		double result = 0.0;
		
		for (int i = 0; i < ingredientArr.length; i++) {
			result = result + ingredientArr[i].getCost();
		}
		return result;
	}

	@Override
	public boolean getHasRice() {
		for (int i = 0; i < ingredientArr.length; i++) {
			if(ingredientArr[i].getIsRice()) {
			return true;
			}
		}
		return false;
	}

	@Override
	public boolean getHasShellfish() {
		for (int i = 0; i < ingredientArr.length; i++) {
			if(ingredientArr[i].getIsShellfish()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getIsVegetarian() {
		for (int i = 0; i < ingredientArr.length; i++) {
			if(ingredientArr[i].getIsVegetarian()) {
				return true;
			}
		}
		return false;
	}
	
}
