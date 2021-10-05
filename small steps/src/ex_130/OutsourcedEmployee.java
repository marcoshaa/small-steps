package ex_130;

public class OutsourcedEmployee extends employee{

	
	private Double addB;
	
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hr, Double valueHr, Double addB) {
		super(name, hr, valueHr);
		this.addB = addB; 
		
	}

	public Double getAddB() {
		return addB;
	}

	public void setAddB(Double addB) {
		this.addB = addB;
	}
	
	@Override
	public double payment() {
		return super.payment() + (1.1*addB);
	}
}
