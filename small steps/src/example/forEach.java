package example;

public class forEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Anna" ,"Luiza", "Andre"};
		
		for(int o = 0; o <vect.length; o++) {
			System.out.println(vect[o]);
		}	
		System.out.println("------------------");
		for(String name : vect) {
			System.out.println(name);
		}
	}
}
