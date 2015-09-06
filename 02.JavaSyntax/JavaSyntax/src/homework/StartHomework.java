package homework;

import java.util.Scanner;

import com.sun.javafx.fxml.expression.BinaryExpression;

public class StartHomework {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Calculating rectangle area. Please input 2 numbers:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		long area = RectangleArea.rectangleArea(a, b);
		System.out.println(area);
		
		System.out.println("Calculating triangle area. Please input 6 numbers:");
		int aA1 = scanner.nextInt();
		int aA2 = scanner.nextInt();
		int bB1 = scanner.nextInt();
		int bB2 = scanner.nextInt();
		int cC1 = scanner.nextInt();
		int cC2 = scanner.nextInt();
		
		area = TriangleArea.triangleArea(aA1, aA2, bB1, bB2, cC1, cC2);
		System.out.println(area);
		
		System.out.println("Calculating Smalest of 3 numbers. Please input 3 numbers:");
		double first = scanner.nextDouble();
		double second = scanner.nextDouble();
		double third = scanner.nextDouble();
		double smallest = SmallestOfThreeNumbers.smallestOfThreeNumbers(first, second, third);
		
		System.out.println(smallest);
		
		System.out.println("Convert decimal to hexadecimal number. Input decimal number:");
		int decimal = scanner.nextInt();
		String hex = DecimalToHexadecimal.decimalToHexadecimal(decimal);
		System.out.println(hex);
		
		int numberA = scanner.nextInt();
		while (numberA < 0 || numberA > 500) {
			numberA = scanner.nextInt();
		}
		
		float numberB = scanner.nextFloat();
		float numberC = scanner.nextFloat();
		int bits = Float.floatToIntBits(numberB);
				
		System.out.printf("|%s|%s|%.2f|%.3f|", Integer.toHexString(numberA), Integer.toBinaryString(bits), numberB, numberC);
		
		
		int numberForCountBits = scanner.nextInt();
		int count = CountOfBitsOne.Count(numberForCountBits);
		System.out.println(count);
		
		scanner.close();
	}
}
























