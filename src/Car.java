

public class Car extends Vehicle {


	private String howToStop = "";
	private String inVehicle = "In Car ";
	private String me;

	private String make;
	private String model;
	private String color;
	private String accelerating;
	private int speed;
	private String stop;
	private String passed;
	private String emissions;
	private String emissionsResult;
	private String currentSpeed;



	// Constructor
	public Car() {

	}

	// Overloaded Constructor
	public Car(String _make) {

		make = _make;

	}

	// Setters
	public void setMake (String _make) {
		make = _make;
	}

	public void setModel (String _model) {
		model = _model;
	}

	public void setColor (String _color) {
		color = _color;
	}

	// Getters
	public String getMake () {
		return make;
	}

	public String getModel () {
		return model;
	}

	public String getColor () {
		return color;
	}



	@Override
	public String stop() {

		stop = " is stopped";
		return stop;
	}

	@Override
	String ridesOn() {
		String travel = "roads";
		return travel;
	}

	public String whoAmI() {
		me = "I am a Car";
		return me;
	}	

	public String setSpeed(int _speed) {
		speed = _speed;
		currentSpeed = speed + " mph";
		return currentSpeed;
	}

	@Override
	public String accelerate() {
		accelerating = " is accelerating";
		return accelerating;
	}

	public String passed() {
		passed = " just passed the ";
		return passed;
	}

	public String emissionsCheck() {
		emissions = " has stopped to have its emissions checked";
		return emissions;
	}

	public String emissionsTest(String _make) {
		if (_make.equalsIgnoreCase("VW")) {
			emissionsResult = " fails its emissions test for 'CHEATING'";
		} else {
			emissionsResult = " passes its emissions test";
		}
		return emissionsResult;
	}



}
