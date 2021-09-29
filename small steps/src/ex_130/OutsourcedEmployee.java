package ex_130;

public class OutsourcedEmployee extends employee{

	
	private Double addB;
	
	public OutsourcedEmployee() {
		
	}
	
	public OutsourcedEmployee(String name, Integer hr, Double valueHr, Double addB) {
		super(name, hr, valueHr);
		this.addB = addB; 
		
	}
}
