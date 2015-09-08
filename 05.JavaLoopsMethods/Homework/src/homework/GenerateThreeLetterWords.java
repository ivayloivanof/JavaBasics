package homework;

import java.util.Scanner;

public class GenerateThreeLetterWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        char[] characters = word.toCharArray();
        StringBuilder sb = new StringBuilder();

        int size = 3;

        for (int i = 0; i < characters.length; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                s.append(characters[i]);
            }
            sb.append(s.toString());
        }

        System.out.println(sb.toString());
        scanner.close();
    }
}
