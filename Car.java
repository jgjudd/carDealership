
public class Car {

	
	static String make;
	static String model;
	static int year;
	static double price; 
	
	Car(String string, String string2, int i, double d) {
		Car.getMake();
		Car.getModel();
		Car.getYear();
		Car.getPrice(); 
	}
	
	public void mainMan(String[] args) {
		
		Car wheels = new Car(null, null, 0, 0); 
		System.out.println(wheels);
		
	}

	public static String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public static String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public static int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}



	
}
