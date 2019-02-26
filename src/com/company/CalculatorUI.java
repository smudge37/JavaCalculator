package com.company;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorUI {
    private Scanner scanner = new Scanner(System.in);

    public ArrayList<Integer> promptForOperands() {
        ArrayList<Integer> operands = new ArrayList<>();
        System.out.println("Please enter some integer operands.");
        while (true) {
            System.out.println("Current list of numbers: ");
            System.out.println(operands.toString());
            if (operands.size() <= 2) {
                System.out.print("Enter an integer or enter q to quit. > ");
            } else {
                System.out.print("Enter an integer, enter done to execute the calculation with the current list of numbers or enter q to quit. > ");
            }

            String input = scanner.next().toLowerCase().trim();
            if (input.equals("done") && operands.size() >= 2) {
                break;
            } else if (input.matches("\\d+")){
                operands.add(Integer.valueOf(input));
            } else if (input.equals("q")) {
                System.exit(-1);
            } else {
                System.out.println("You have not provided valid input.");
            }
            scanner.nextLine();
        }
        return operands;
    }

    public int promptForNewInteger() {
        System.out.print("Enter an integer. > ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("You have entered an invalid character.");
            return promptForNewInteger();
        }
    }

    public Operation promptForOperation() {
        System.out.print("Please an operation. You may choose from -, +, and *. Enter q to quit. > ");
        String input = scanner.next();
        switch (input) {
            case "-":
                return new Subtract();
            case "+":
                return new Add();
            case "*":
                return  new Multiply();
            case "q":
                System.exit(-1);
            default:
            System.out.println("You have not provided valid input.");
            return promptForOperation();
        }
    }

    public void printAnswer(ArrayList<Integer> operands, Operation op, int ans) {
        StringBuilder output = new StringBuilder();
        for (int index = 0; index < operands.size() - 1; index++) {
            output.append(operands.get(index))
                    .append(" ")
                    .append(op.getMathSymbol())
                    .append(" ");
        }
        output.append(operands.get(operands.size() - 1)) // Don't want operation symbol after last operand
                .append(" = ")
                .append(ans);
        System.out.println(output);
    }

    public boolean userWantsNewCalculation() {

        System.out.print("Would you like to carry out a new calculation? (y/n) > ");

        String input = scanner.next();

        switch (input.toLowerCase()) {
            case "y":
                return true;
            case "n":
                return false;
            default:
                System.out.println("I'll take that as a no.");
                return false;
        }
    }
}
