package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorUI {
    private Scanner scanner = new Scanner(System.in);

    public int promptForInteger() {
        System.out.print("Please enter an integer. > ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid character.");
            return promptForInteger();
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
            System.out.println("You have entered an invalid character.");
            return promptForOperation();
        }
    }

    public void printAnswer(int x, int y, Operation op, int ans) {
        System.out.println(x + " " + op.getMathSymbol() + " " + y + " = " + ans);
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
                System.out.println("You didn't enter y or n, so I'll assume you wouldn't. See ya!");
                return false;
        }
    }
}
