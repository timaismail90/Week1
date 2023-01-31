package introtojava;


public class Car {
	
	// Attributes
	private String color;
	private String brand;
	private int price;
	
	// constructor
	public Car(String color, String brand, int price){
		this.color = color;
		this.brand = brand;
		this.price = price;
		
	}
	// function printCarDetails
	 public void printCarDetails () {
		 System.out.println("Color: " + this.color);
		 System.out.println("Brand: " + this.brand);
		 System.out.println("Price: " + this.price);
		 
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("white", "BMW", 70000);
	       Car car2 = new Car("Red", "Audi", 80000);
	       car1.printCarDetails();
	       car2.printCarDetails();

	}

}
