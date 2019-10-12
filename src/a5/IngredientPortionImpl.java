package a5;

// Ingredient Portion implementation class
public class IngredientPortionImpl implements IngredientPortion{
	
	private Ingredient ingredient;
	private double amount;
	
	public IngredientPortionImpl(Ingredient _ingredient, double _amount) {		
		amount = _amount;
		ingredient = _ingredient;
		
		if (amount <= 0) {
			throw new RuntimeException("amount needs to be positive");
		}
		
	}

	@Override
	public Ingredient getIngredient() {
		return ingredient;
	}

	@Override
	public double getAmount() {
		return amount;
	}
	
	public String getName() {
		return ingredient.getName();
	}

	@Override
	public double getCalories() {
		double caloriesPerOunce = ingredient.getCaloriesPerOunce();
		double calories = (caloriesPerOunce * amount);
		return calories;
	}

	@Override
	public double getCost() {
		double pricePerOunce = ingredient.getPricePerOunce();
		double cost = pricePerOunce * amount;
		return cost;
	}

	@Override
	public boolean getIsVegetarian() {
		return ingredient.getIsVegetarian();
	}

	@Override
	public boolean getIsRice() {
		return ingredient.getIsRice();
	}

	@Override
	public boolean getIsShellfish() {
		return ingredient.getIsShellfish();
	}

	@Override
	public IngredientPortion combine(IngredientPortion otherPortion) {
		if (otherPortion == null) {
			return this;
		}
		if (otherPortion.getAmount()<0) {
			throw new RuntimeException("IngredientPortion must have the same amount");
		
		}
		
		if (!this.equals(otherPortion)) {
			throw new RuntimeException("IngredientPortion must be same");
		}
		
		IngredientPortion ingredientPortionObject = new IngredientPortionImpl(ingredient, amount + otherPortion.getAmount());
		
		return ingredientPortionObject;
	}
	
}
