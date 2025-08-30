package lesson17_inheritance;

public class Car extends Machine{
	
	
	@Override
	public void start() {
		System.out.println("Car started");
	}

	public void wipeWindShield() {
		System.out.println("Wiping windshiled");
	}
	
	public void showInfo() {
		System.out.println("Car name : " + name);		
	}
	
}
