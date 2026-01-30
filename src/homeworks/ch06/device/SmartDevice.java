package homeworks.ch06.device;

public class SmartDevice {

	// The private instance variables
	private String brand;
	private String model;
	private double price;
	
	/*
	 * CONSTRUCTORS
	 */
	
	// +SmartDevice(brand: String, model: String, price: double)
	public SmartDevice(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public SmartDevice(String brand, String model) {
		this(brand, model, 100.00);
	}
	
	public SmartDevice() {
		this("Unknown", "Generic");
	}
}
