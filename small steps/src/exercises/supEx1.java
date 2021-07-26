package exercises;

public class supEx1 {
	
	
	 String name;
	 double note1;
	 double note2;
	 double note3;
	 
	public double average() {
		return note1 + note2 + note3;
	}
	
	public String toString() {
		return "Final grade: " 
				+ average()
				+"  "
				+ "Missing: "
				+ (60 - average());
	}
	
}
