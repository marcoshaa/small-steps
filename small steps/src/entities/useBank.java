package entities;

public class useBank {

	private int nr;
	private String name;
	private double value;

	
	public useBank() {
		
	}
	

	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNr() {
		return nr;
	}
	
	public void setNr(int nr) {
		this.nr = nr;
	}
	
	public String toString() {
		return "Account "
				+ getNr()
				+", "
				+"Holder: "
				+ getName()
				+", "
				+"Balance: $ "
				+String.format("%.2f", getValue());
	}
	
}
