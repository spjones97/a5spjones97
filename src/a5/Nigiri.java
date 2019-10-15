package a5;

// Create Nigiri class
public class Nigiri implements Sushi{
	public enum NigiriType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
	protected String ingredientName;
	protected IngredientPortion[] ingredientPortionArr;
	protected IngredientPortion ingredientAmount;
	protected IngredientPortion ingredientRiceAmount;
	
	public Nigiri(NigiriType _type) {
		
		int amountOfIngredients = 2;
		
		ingredientPortionArr = new IngredientPortion[amountOfIngredients];
		ingredientRiceAmount = new RicePortion(0.5);
		

		if (_type == NigiriType.TUNA) {
			ingredientName = "tuna nigiri";
			ingredientAmount = new TunaPortion(0.75);
		} else if (_type == NigiriType.YELLOWTAIL) {
			ingredientName = "yellowtail nigiri";
			ingredientAmount = new YellowtailPortion(0.75);
		} else if (_type == NigiriType.EEL) {
			ingredientName = "eel nigiri";
			ingredientAmount = new EelPortion(0.75);
		} else if (_type == NigiriType.CRAB) {
			ingredientName = "crab nigiri";
			ingredientAmount = new CrabPortion(0.75);
		} else if (_type == NigiriType.SHRIMP) {
			ingredientName = "shrimp nigiri";
			ingredientAmount = new ShrimpPortion(0.75);
		}

		int firstIngredient = 0;
		int secondIngredient = 1;
		
		ingredientPortionArr[firstIngredient] = ingredientAmount;
		ingredientPortionArr[secondIngredient] = ingredientRiceAmount;
		
		
		for (int i = 0; i < ingredientPortionArr.length; i++) {
			if (ingredientPortionArr[i] == null) {
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
		return ingredientPortionArr;
	}

	@Override
	public int getCalories() {
		double result = 0;
		int finalValue = 0;

		result = ingredientPortionArr[0].getCalories() + ingredientPortionArr[1].getCalories();
		finalValue = (int)(result + 0.5);
		
		return finalValue;
	}

	@Override
	public double getCost() {
		double cost = 0;
		for (int i = 0; i < ingredientPortionArr.length; i++) {
			cost = cost + ingredientPortionArr[i].getCost();
		}
		return cost;
	}

	@Override
	public boolean getHasRice() {
		for (int i = 0; i < ingredientPortionArr.length; i++) {
			if (!ingredientPortionArr[i].getIsRice()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean getHasShellfish() {
		for (int i = 0; i < ingredientPortionArr.length; i++) {
			if(ingredientPortionArr[i].getIsShellfish()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getIsVegetarian() {
		for (int i = 0; i < ingredientPortionArr.length; i++) {
			if(ingredientPortionArr[i].getIsShellfish()) {
				return true;
			}
		}
		return false;
	}
}
