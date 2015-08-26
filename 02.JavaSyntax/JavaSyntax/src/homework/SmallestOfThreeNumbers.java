package homework;

public class SmallestOfThreeNumbers {
	public static double smallestOfThreeNumbers(double a, double b, double c) {
		if (a < b && a < c) {
			return a;
		}
		
		if (b < c && b < a) {
			return b;
		}
		
		if (c < a && c < b) {
			return c;
		}
		
		if (a == b) {
			return a;
		}
		
		if (b == c) {
			return b;
		}
		
		if (c == a) {
			return c;
		}
		
		return 0;
	}
}
