package homework;

import java.util.*;

public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        scanner.close();

        List<String> sequence = new ArrayList<>();
        for (int i = 0; i < line.length - 1; i++) {
            List<String> var = new ArrayList<>();
            var.add(line[i]);
            
            while ((i < line.length - 1) && (line[i + 1].equals(line[i]))) {
                var.add(line[i + 1]);
                i++;
            }
            if (var.size() > sequence.size()) {
                sequence.clear();
                sequence.addAll(var);
            }
        }

        if (line.length == 1) {
            sequence.add(line[0]);
        }

        System.out.println(sequence);
    }
}
