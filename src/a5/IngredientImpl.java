package a5;

// Create Ingredient Implementation class
public class IngredientImpl implements Ingredient{

	private String ingredientName;
	private double pricePerOz;
	private int caloriePerOz;
	
	public IngredientImpl(String _name, double _price, int _calories) {
		ingredientName = _name;
		pricePerOz = _price;
		caloriePerOz = _calories;
	}
	
	
	public String getName() {
		return ingredientName;
	}

	
	public double getCaloriesPerDollar() {
		double caloriesPerDollar = caloriePerOz / pricePerOz;
		return caloriesPerDollar;
	}

	
	public int getCaloriesPerOunce() {
		return caloriePerOz;
	}

	
	public double getPricePerOunce() {
		return pricePerOz;
	}

	
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
	
	
	//Overridden default statements
	
	public boolean getIsVegetarian() {
		return false;
	}

	
	public boolean getIsRice() {
		return false;
	}

	
	public boolean getIsShellfish() {
		return false;
	}
	
}
