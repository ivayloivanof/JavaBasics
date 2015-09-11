package homework;

import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\W");
        String specifiedWord = scanner.nextLine();
        scanner.close();

        int count = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            if (specifiedWord.compareTo(word) == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
