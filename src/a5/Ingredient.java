package a5;

// Ingredient interface (DO NOT TOUCH)
public interface Ingredient {
	String getName();
	double getCaloriesPerDollar();
	int getCaloriesPerOunce();
	double getPricePerOunce();
	boolean equals(Ingredient other);
	boolean getIsVegetarian();
	boolean getIsRice();
	boolean getIsShellfish();

}
