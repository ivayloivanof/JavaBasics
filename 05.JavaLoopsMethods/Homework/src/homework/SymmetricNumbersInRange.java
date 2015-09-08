package homework;

import java.util.Scanner;

public class SymmetricNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = scanner.nextInt();
        int endNUmber = scanner.nextInt();

        for (int i = startNumber; i <= endNUmber; i++) {
            String number = i + "";
            if (number.length() == 1) {
                System.out.println(number);
                continue;
            }

            char[] numbers = number.toCharArray();

            for (int j = 0, k = numbers.length - 1; j < numbers.length / 2; j++, k--) {
                if (numbers[j] != numbers[k]) {
                    break;
                }

                System.out.println(number);
            }
        }

        scanner.close();
    }
}
