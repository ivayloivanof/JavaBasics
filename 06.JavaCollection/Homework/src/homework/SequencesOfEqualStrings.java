package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();

        String[] words = line.split("\\s+");
        ArrayList<String> result = new ArrayList<String>();
        result.add(words[0]);
        String s = null;

        for (int i = 0; i < words.length; i++) {

        }

        System.out.println(String.join(", ", words));

        result.forEach(System.out::println);
    }
}
