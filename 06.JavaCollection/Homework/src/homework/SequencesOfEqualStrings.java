package homework;

import java.util.Scanner;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        scanner.close();

        if (line.length == 1) {
            System.out.println(line[0]);
        }

        for (int i = 0; i < line.length - 1; i++) {
            System.out.print(line[i] + " ");

            while ((i < line.length - 1) && (line[i].equals(line[i + 1]))) {
                System.out.print(line[i + 1] + " ");
                i++;
            }

            System.out.println();
        }

        if ((line.length > 1) && (!line[line.length - 1].equals(line[line.length - 2]))) {
            System.out.println(line[line.length - 1]);
        }
    }
}
