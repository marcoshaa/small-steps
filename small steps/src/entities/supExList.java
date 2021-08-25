package entities;

public class supExList {

	private byte id;
	private String name;
	private double salary;
	
	public supExList() {
		
	}
	public supExList(byte id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public byte getId() {
		return id;
	}
	public void setId(byte id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void ausalary(Double percSalary) {
		this.salary = salary + (salary * (percSalary /100));
	}
	
	
}
