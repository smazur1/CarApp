

public class CarApp {

	public static void main(String[] args) {

		Car c = new Car();
		Car vw = c;
		vw.setMake("vw");
		vw.setModel("Jetta");
		vw.setColor("blue");

		Car p = new Car("Porsche");
		p.setModel("911");
		p.setColor("red");




		System.out.println("The " + p.getColor() + " " + p.getMake() + p.start());

		System.out.println("The " + p.getColor() + " " + p.getMake() + p.accelerate());

		System.out.println("The " + p.getColor() + " " + p.getMake() + " is going " + p.setSpeed(50));

		System.out.println("The " + p.getColor() + " " + p.getMake() + p.stop());

		//
		System.out.println();

		System.out.println("The " + vw.getColor() + " " + vw.getModel() + vw.accelerate());

		System.out.println("The " + vw.getColor() + " " + vw.getModel() + vw.emissionsCheck());

		System.out.println("The " + vw.getColor() + " " + vw.getModel() + vw.emissionsTest(vw.getMake()));

		System.out.println();

		System.out.println("The " + p.getColor() + " " + p.getModel() + p.emissionsCheck());

		System.out.println("The " + p.getColor() + " " + p.getModel() + p.emissionsTest(p.getMake()));

		System.out.println();
		
		System.out.println("The " + p.getColor() + " " + p.getMake() + " is going " + p.setSpeed(50));

		System.out.println("The " + p.getColor() + " " + p.getMake() + p.stop());

		System.out.println("The " + vw.getColor() + " " + vw.getModel() + vw.passed() + 
				p.getColor() + " " + p.getMake());

	}
}
