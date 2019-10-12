package a4;

// Create Roll class
public class Roll implements Sushi{

	protected String ingredientName;
	protected IngredientPortion[] ingredientPortionArray;
	
	public Roll(String name, IngredientPortion[] roll_ingredients) {

		ingredientPortionArray = new IngredientPortion[50];
				
		ingredientName = name;
		
		ingredientPortionArray = roll_ingredients.clone();
	
		int totalLength = roll_ingredients.length + 1;
		int counter = 0;
		int i = 0;
		
		IngredientPortion[] ingredientPortions = new IngredientPortion[totalLength];
		
		while(i < ingredientPortionArray.length) {
			if (has(ingredientPortions, counter, ingredientPortionArray[i])) {
				for (int j = 0; j < counter; j++) {
					if (ingredientPortionArray[i].getName().equals(ingredientPortions[j].getName())) {
						ingredientPortions[j] = ingredientPortions[j].combine(ingredientPortionArray[i]);
					}
				}
			} else {
				ingredientPortions[counter] = ingredientPortionArray[i];
				counter++;
				} 
			i++;
			}
		
		IngredientPortion seaweedPortion = new SeaweedPortion(0.1);
		int a = 0;
		if(has(ingredientPortions, counter, seaweedPortion)){
			while(a<counter) {
				if((ingredientPortions[a].getName().equals("seaweed")) && (ingredientPortions[a].getAmount()<0.1)) {
					IngredientPortion seaweeds = new SeaweedPortion(0.1 - ingredientPortions[a].getAmount());
					ingredientPortions[a] = ingredientPortions[a].combine(seaweeds);
				}
			a++;
			}
		} else {
			ingredientPortions[counter] = new SeaweedPortion(0.1);
			counter++;
		}

		IngredientPortion[] countArray = new IngredientPortion[counter];
		int b=0;
		while(b<counter ) {
			countArray[b]=ingredientPortions[b];
			b++;
		}	
		ingredientPortionArray=countArray;
		
}
	
	public String getName() {
		return ingredientName;
	}

	
	public IngredientPortion[] getIngredients() {
		return ingredientPortionArray;
	}
	
	public int getCalories() {
		double result = 0.0;
		double hold = 0.0;
		int calories = 0;
		for (int i = 0; i < ingredientPortionArray.length; i++) {
			hold = ingredientPortionArray[i].getCalories();
			result = result + hold;
		}
		calories = (int)(result + 0.5);
		return calories;
	}
	
	public double getCost() {
		double result = 0.0;
		for (int i = 0; i < ingredientPortionArray.length; i++) {
			result += ingredientPortionArray[i].getCost();
		}
		double cost = (int)((result * 100.0) + 0.5) / 100.0;
		return cost;
	}
	
	public boolean getHasRice() {
		for (int i = 0; i < ingredientPortionArray.length; i++) {
			if (ingredientPortionArray[i].getIsRice()) {
				return true;
			}
		}
		return false;
	}
	
	public boolean getHasShellfish() {
		for (int i = 0; i < ingredientPortionArray.length; i++) {
			if (!ingredientPortionArray[i].getIsShellfish()) {
				return false;
			}
		}
		return true;
	}

	public boolean getIsVegetarian() {
		for (int i = 0; i < ingredientPortionArray.length; i++) {
			if (!ingredientPortionArray[i].getIsVegetarian()) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean has (IngredientPortion[] ingredientArray, int counter, IngredientPortion ingredientPortion) {
		for (int i = 0; i < counter; i++) {
			if (ingredientPortion.getName().equals(ingredientArray[i].getName())) {
				return true;
			}
		}
		return false;
	}

}