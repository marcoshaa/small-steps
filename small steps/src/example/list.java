package example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class list {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Mario");
		list.add("Joao");
		list.add("Andre");
		list.add("Carlos");
		list.add("Carol");
		list.add(3,"Jose");
		
		System.out.println(list.size());	
		System.out.println("________________");
		for (String x : list) {
			System.out.println(x);
			
		}
		System.out.println("________________");
		list.removeIf(x -> x.charAt(0) == 'C');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("________________");
		
		System.out.println("Index of Jose" + list.indexOf("Jose"));
		System.out.println("Index of Carol" + list.indexOf("Carol"));
		
		
		System.out.println("________________");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		for (String x : result){
			System.out.println(x);
		}
		System.out.println("________________");
		String name = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
		System.out.println(name);
	}
}
