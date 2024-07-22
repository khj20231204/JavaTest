package my_ex.inherit01.ex02;

class Vehicle{
	String name = "Vehicle";
	public void run() {
		System.out.println("Vehicle에서 달린다");
	}
}

class Bus extends Vehicle{
	String name = "Bus";

	@Override
	public void run() {
		System.out.println("Bus가 달린다");
	}
}

class Taxi extends Vehicle{
	
	public Taxi() {
		super.name = "Taxi";
	}
	
	
	@Override
	public void run() {
		System.out.println("Taxi에서 달린다");
	}
}

class Run{
	public void run(Vehicle v) {
		System.out.println(v.name+ "이 달린다");
		v.run();
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		Run run = new Run();
		run.run(taxi);
	}

}
