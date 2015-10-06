package dragonsharp;

import java.util.ArrayList;
import java.util.Scanner;

public class DragonSharp {
    private static final String error = "Compile time error @ line";
    private static ArrayList<String> printArr = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberRows = Integer.parseInt(scanner.nextLine());
        boolean isPrint = false;
        boolean compileError = false;
        boolean nextRow = true;

        for (int i = 0; i < numberRows; i++) {
            String statement = scanner.next();
            if (statement.contains("else") && nextRow == false) {
                continue;
            }
            String condition = scanner.next();
            String text = scanner.nextLine();

            if (!text.contains(";")) {
                compileError = true;
                System.out.println(error + " " + (i+1));
                break;
            }

            String[] decides = text.trim().split(" ");
            String[] arrText = text.split("\"");
            if (!text.contains("\"")) {
                compileError = true;
                System.out.println(error + " " + (i+1));
                break;
            }

            String resultForPrint = arrText[1];

            if ("if".compareTo(statement) == 0) {
                isPrint = false;
                String[] str = new String[condition.length()];
                condition = condition.replace("(", "").replace(")", "").trim();
                if (condition.contains("=")) {
                    condition = condition.replace("==", "=");
                    str = condition.split("=");
                    int firstNumber = Integer.parseInt(str[0]);
                    int secondNumber = Integer.parseInt(str[1]);
                    if (firstNumber == secondNumber) {
                        isPrint = true;
                    }
                } else if (condition.contains("<")) {
                    str = condition.split("<");
                    int firstNumber = Integer.parseInt(str[0]);
                    int secondNumber = Integer.parseInt(str[1]);
                    if (firstNumber < secondNumber) {
                        isPrint = true;
                    }
                } else if (condition.contains(">")) {
                    str = condition.split(">");
                    int firstNumber = Integer.parseInt(str[0]);
                    int secondNumber = Integer.parseInt(str[1]);
                    if (firstNumber > secondNumber) {
                        isPrint = true;
                    }
                }

                if (decides[0].compareTo("loop") == 0 && isPrint) {
                    PrintResult(Integer.parseInt(decides[1]), resultForPrint);
                } else if (decides[0].compareTo("out") == 0 && isPrint) {
                    PrintResult(1, resultForPrint);
                }
            } else {
                if (!isPrint) {
                    if (condition.compareTo("loop") == 0) {
                        PrintResult(Integer.parseInt(decides[0]), resultForPrint);
                    } else if (condition.compareTo("out") == 0) {
                        System.out.println(resultForPrint);
                    }
                }
            }
        }

        if (!compileError) {
            for (int i = 0; i < printArr.size(); i++) {
                System.out.println(printArr.get(i));
            }
        }

    }

    private static void PrintResult(int num, String text) {
        for (int i = 0; i < num; i++) {
            printArr.add(text);
        }
    }
}
