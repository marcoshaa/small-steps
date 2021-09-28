package ex_130;

public class employee {

	private String name;
	private Integer hr;
	private Double valueHr;
	
	public employee() {
		
	}

	public employee(String name, Integer hr, Double valueHr) {
		this.name = name;
		this.hr = hr;
		this.valueHr = valueHr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHr() {
		return hr;
	}

	public void setHr(Integer hr) {
		this.hr = hr;
	}

	public Double getVaueHr() {
		return valueHr;
	}

	public void setVaueHr(Double valueHr) {
		this.valueHr = valueHr;
	}
	
	public double payment() {
		return hr * valueHr;
	}
}
