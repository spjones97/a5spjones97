package a5;

// Ingredient implementation class
public class IngredientImpl implements Ingredient{

	private String ingredientName;
	private double pricePerOunce;
	private int caloriePerOunce;
	
	public IngredientImpl(String _name, double _price, int _calories) {
		ingredientName = _name;
		pricePerOunce = _price;
		caloriePerOunce = _calories;
	}
	
	@Override
	public String getName() {
		return ingredientName;
	}

	@Override
	public double getCaloriesPerDollar() {
		double caloriesPerDollar = caloriePerOunce / pricePerOunce;
		return caloriesPerDollar;
	}

	@Override
	public int getCaloriesPerOunce() {
		return caloriePerOunce;
	}

	@Override
	public double getPricePerOunce() {
		return pricePerOunce;
	}

	@Override
	public boolean equals(Ingredient other) {
		double subtracted = Math.abs(getPricePerOunce() - other.getPricePerOunce());
		String name = other.getName();
		
		if(getName().equals(name)) {
			if (getCaloriesPerOunce() == other.getCaloriesPerOunce()) {
				if (subtracted <= 0.1) {
					return true;
				} return false;
			} return false;
		} return false;
	}

	@Override
	public boolean getIsVegetarian() {
		return false;
	}

	@Override
	public boolean getIsRice() {
		return false;
	}

	@Override
	public boolean getIsShellfish() {
		return false;
	}


}
