package lesson22_encapsulation;

class Plant {
	
	public static final int ID = 7;
	private String name;
	
	public String getData() {
		String data = "some stuff" + calculateGrowthForecate();
		
		return data;
	}
	
	private int calculateGrowthForecate() {
		return 9;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class EncapsulationPractice {
	public static void main(String[] args) {
		
	}

}
