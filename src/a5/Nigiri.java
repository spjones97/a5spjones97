package a5;

public class Nigiri implements Sushi{

	public enum NigiriType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
	protected String ingredientName;
	protected IngredientPortion[] ingredientPortionArr;
	protected IngredientPortion ingredientAmount;
	protected IngredientPortion ingredientRiceAmount;
	
	public Nigiri(NigiriType _type) {
		
		int amountIngredients = 2;
		
		ingredientPortionArr = new IngredientPortion[amountIngredients];
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
		
		int ingredOne = 0;
		int ingredTwo = 1;
		
		ingredientPortionArr[ingredOne] = ingredientAmount;
		ingredientPortionArr[ingredTwo] = ingredientRiceAmount;
		
		
		for (int i = 0; i< ingredientPortionArr.length; i++) {
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
//		for(int i=0; i<ingredientPortionArray.length; i++) {
//			result = result + ingredientPortionArray[i].getCalories();
//		}
		finalValue = (int)(result + 0.5);
		
		return finalValue;
	}

	@Override
	public double getCost() {
		double result = 0;
		for (int i = 0; i< ingredientPortionArr.length; i++) {
			result = result + ingredientPortionArr[i].getCost();
		}
		return result;
	}

	@Override
	public boolean getHasRice() {
		for (int i = 0; i< ingredientPortionArr.length; i++) {
			if (!ingredientPortionArr[i].getIsRice()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean getHasShellfish() {
		for (int i = 0; i< ingredientPortionArr.length; i++) {
			if(ingredientPortionArr[i].getIsShellfish()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getIsVegetarian() {
		for (int i = 0; i< ingredientPortionArr.length; i++) {
			if(ingredientPortionArr[i].getIsShellfish()) {
				return true;
			}
		}
		return false;
	}
}
