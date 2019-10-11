package a5;

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
		
		IngredientPortion[] ingredientArr = new IngredientPortion[totalLength];
		
		while(i < ingredientPortionArray.length) {
			if (has(ingredientArr, counter, ingredientPortionArray[i])) {
				for (int f=0; f<counter; f++) {
					if (ingredientPortionArray[i].getName().equals(ingredientArr[f].getName())) {
						ingredientArr[f] = ingredientArr[f].combine(ingredientPortionArray[i]);
					}
				} 					
			} else {
				ingredientArr[counter] = ingredientPortionArray[i];
				counter++;
				} 
			i++;
			}
		
		IngredientPortion seaweedPortion = new SeaweedPortion(0.1);
		int y = 0;
		if(has(ingredientArr, counter, seaweedPortion)){
			while(y < counter) {
				if((ingredientArr[y].getName().equals("seaweed")) && (ingredientArr[y].getAmount()<0.1)) {
						IngredientPortion seaweeds = new SeaweedPortion(0.1 - ingredientArr[y].getAmount());
						ingredientArr[y] = ingredientArr[y].combine(seaweeds);
				}
			y++;
			}
		} else {
			ingredientArr[counter] = new SeaweedPortion(0.1);
			counter++;
		}

		// New set of arrays
		IngredientPortion[] countArray = new IngredientPortion[counter];

		for (int k = 0; k < counter; k++) {
			countArray[i] = ingredientArr[i];
		}
		ingredientPortionArray = countArray;
		
}
	
	public String getName() {
		return ingredientName;
	}

	
	public IngredientPortion[] getIngredients() {
		return ingredientPortionArray;
	}
	
	public int getCalories() {
		double result = 0.0;
		double holder = 0.0;
		int integer = 0;
		for (int i = 0; i < ingredientPortionArray.length; i++) {
			holder = ingredientPortionArray[i].getCalories();
			result = result + holder;
		}
		integer = (int)(result + 0.5);
		return integer;
	}
	
	public double getCost() {
		double result = 0.0;
		for (int i = 0; i < ingredientPortionArray.length; i++) {
			result += ingredientPortionArray[i].getCost();
		}
		double value = (int)((result * 100.0) + 0.5) / 100.0;
		return value;
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
			i++;
		}
		return false;
	}

}