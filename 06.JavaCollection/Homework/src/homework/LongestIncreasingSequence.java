package homework;

import java.util.*;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        scanner.close();

        int max = Integer.MIN_VALUE;
        ArrayList<String> numbers = new ArrayList<>();
        String sequence = "";

        for (int i = 0; i < line.length; i++) {
            int number = Integer.parseInt(line[i]);

            if (max > number) {
                numbers.add(sequence.trim());
                max = Integer.MIN_VALUE;
                sequence = "";
                i--;
                continue;
            }

            if (max == number) {
                numbers.add(sequence.trim());
                max = Integer.MIN_VALUE;
                sequence = "";
                i--;
                continue;
            }

            sequence += number + " ";
            max = number;

            if (i == line.length - 1) {
                numbers.add(sequence.trim());
            }
        }

        String longest = "Longest:";
        String longestResult = "";
        int var = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.size(); i++) {
            String row = numbers.get(i);
            row = row.replace("-", "");
            if (var < row.length()) {
                var = row.length();
                longestResult = row;
            }
        }

        System.out.printf("%s %s", longest, longestResult);
    }
}
