package a5;

// Create Ingredient Portion Implementation class
public class IngredientPortionImpl implements IngredientPortion{
	
	private Ingredient ingredient;
	private double amount;
	
	public IngredientPortionImpl(Ingredient _ingredient, double _amount) {		
		amount = _amount;
		ingredient = _ingredient;
		
		if (amount <= 0) {
			throw new RuntimeException("amount must be positive");
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
	public IngredientPortion combine(IngredientPortion other) {
		if (other == null) {
			return this;
		}
		if (other.getAmount()<0) {
			throw new RuntimeException("IngredientPortion must have the same amount");
		}
		
		if (!getIngredient().equals(other.getIngredient())) {
			throw new RuntimeException("IngredientPortion must be same");
		}
		
		IngredientPortion ingredientPortion = new IngredientPortionImpl(ingredient, amount + other.getAmount());
		
		return ingredientPortion;
	}
	
}
