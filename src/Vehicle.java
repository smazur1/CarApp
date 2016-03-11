

public abstract class Vehicle {

	private int speed = 0;
	private String canStop = "";
	private String starting = ""; 
	private String inVehicle = "In Vehicle ";


	public Vehicle() {

	}

	public String start() {

		starting = " is starting ";
		return starting;

	}

	public String stop() {

		canStop = "Vehicle can stop ";
		return canStop;
	}

	abstract String accelerate(); // abstract method

	abstract String ridesOn();  // abstract method

	abstract String whoAmI();  // abstract method
}


