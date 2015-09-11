package homework;

import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("\\W");
        scanner.close();

        System.out.println(text.length);

    }
}
