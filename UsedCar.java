
public class UsedCar extends Car {

	static int miles; 
	
	UsedCar() {
		
		getMiles();
	}
	
	
	public void mainMan(String[] args) {
		
		super.mainMan(args); 
		UsedCar.setMiles(miles);
	}

	public void usedMainCar(String make, String model, int year, double price) {
	
		UsedCar chittyChittyBangBang = new UsedCar();
		
		chittyChittyBangBang.mainMan(null);
		
	}
	
	public static int getMiles() {
		
		return miles;
	}

	public static void setMiles(int miles) {
		
		UsedCar.miles = miles;
	}

}
