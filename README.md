# Assignment 5

In this assignment, you will create classes that represent the plates in our sushi restaurant. It will also require you to develop and use a checked exception. To complete this assignment, you will have had to complete at least through A4 Adept. If you haven't done so, keep working on that assignment first.

This assignment only has one part (i.e., no novice/adept/jedi).

## Setup

Copy all of the interfaces and classes from the a4 package from Assignment 4 into the a5 package here in Assignment 5. 

## What To Do

First, create a new checked exception class called ```PlatePriceException```. The message associated with this exception should be "Illegal plate price". Recall that a checked exception is one that is a direct subclass of ```Exception```.

Second, create a ```Plate``` interface in a5 as follows:
```
public interface Plate { 
   public enum Color {RED, GREEN, BLUE, GOLD};
   Sushi getContents(); 
   Sushi removeContents(); 
   void setContents(Sushi s) throws PlatePriceException; 
   boolean hasContents(); 
   double getPrice(); 
   Plate.Color getColor(); 
   double getProfit(); 
}
```

A class that implements the ```Plate``` interface will represent a plate that may or may not have sushi on it. A plate object is also associated with a price and a color. The color of the plate must be one of the symbols defined by the Plate.Color enumeration. The semantics of the Plate interface methods are as follows:

* Sushi getContents()
  * Returns the contents of the plate. If the plate is empty, this should return null.
* Sushi removeContents()
  * If the plate is already empty, this method does nothing and returns null. If not empty, the plate is made empty and the prior contents of the plate is returned.
* void setContents(Sushi s) throws PlatePriceException
  * This method sets the contents of the plate to be the Sushi object passed in as parameter s, replacing any prior contents the plate may have had, if any. If s is null, this method should throw an IllegalArgumentException. If the price of the plate is less than or equal to the cost of the sushi being placed on it (i.e., there is no profit), then this method should throw a PlatePriceException. If either of these exceptions occurs, the plate should remain unchanged.
* boolean hasContents()
  * Returns true if the plate has sushi on it, false if not.
* double getPrice()
  * Returns the price associated with the plate.
* Plate.Color getColor()
  * Returns the color associated with the plate as represented by one of the Plate.Color enumeration symbols.
* double getProfit()
  * If the plate is empty, returns 0.0. Otherwise, returns the difference between the price of the plate and the cost of the sushi on it.

Finally, create the following classes that all implement the Plate interface. Use inheritance as you see necessary.

* RedPlate

  A RedPlate is associated with the color symbol Plate.Color.RED and has a price of 1.0. This class should provide a constructor with the following signature:
  ```
  public RedPlate(Sushi contents) throws PlatePriceException
  ```
  A null value for contents indicates that the plate should be initially empty. Otherwise, the contents should be set, possibly throwing a PlatePriceException if the cost of the contents exceed the price of a RedPlate (i.e. 1.0).

* GreenPlate
  
  A GreenPlate is associated with the color symbol Plate.Color.GREEN and has a price of 2.0. This class should provide a constructor with the following signature:
  ```
  public GreenPlate(Sushi contents) throws PlatePriceException
  ```
  A null value for contents indicates that the plate should be initially empty. Otherwise, the contents should be set, possibly throwing a PlatePriceException if the cost of the contents exceed the price of a GreenPlate (i.e. 2.0).

* BluePlate

  A BluePlate is associated with the color symbol Plate.Color.BLUE and has a price of 4.0. This class should provide a constructor with the following signature:
  ```
  public BluePlate(Sushi contents) throws PlatePriceException
  ```
  A null value for contents indicates that the plate should be initially empty. Otherwise, the contents should be set, possibly throwing a PlatePriceException if the cost of the contents exceed the price of a BluePlate (i.e. 4.0).

* GoldPlate
  A GoldPlate is associated with the color symbol Plate.Color.GOLD and has a variable price that must be at least 5.0. This class should provide a constructor with the following signature:
  ```
  public GoldPlate(Sushi contents, double price) throws PlatePriceException
  ```
  If the value of price given to the constructor is less than 5.0, the constructor should throw an IllegalArgumentException. A null value for contents indicates that the plate should be initially empty. Otherwise, the contents should be set, possibly throwing a PlatePriceException if the cost of the contents exceed the price of the plate.
