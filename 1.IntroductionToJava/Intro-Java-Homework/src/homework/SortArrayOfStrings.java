package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayOfStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfRows = scanner.nextInt();
		ArrayList<String> towns = new ArrayList<String>();
		
		for (int i = 0; i <= numberOfRows; i++) {
			String line = scanner.nextLine();
			if (line != "" && line != null) {
				towns.add(line);
			}
		}
		
		Collections.sort(towns);
		
		for (String town : towns) {
			System.out.println(town);
		}
		
		scanner.close();
	}
}
