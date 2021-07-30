package entities;

public class supDollar {

	public static double rate;
	public static double money;
	public static double exchange;

	public static double convert() {
		return money * exchange * (rate/100);
	}
}

