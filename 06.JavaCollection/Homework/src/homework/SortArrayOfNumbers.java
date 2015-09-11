package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < number; i++) {
            numbers.add(scanner.nextInt());
        }

        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
