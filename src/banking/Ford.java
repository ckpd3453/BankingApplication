package banking;

public class Ford extends Car {
	
	/**Procedure:-
	 * ==========
	 * 1. Created a Sub Class
	 * 2. Created a constructor passing all arguments
	 * 3. Created a method to get the sale price of car 
	 */
	private int year;
	private int manufacturerDiscount;

	//2. Created a constructor passing all arguments
	public Ford(int Speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(Speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	//3. Created a method to get the sale price of car
	public double getSalePrice() {
		return super.getSalePrice()-manufacturerDiscount;
	}
}