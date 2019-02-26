package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number to operate on.");
        int x = scanner.nextInt();
        System.out.println("Please enter the second number to operate on.");
        int y = scanner.nextInt();
        int output = 0;
        String input = "";
        boolean operationChosen = false;

        while (!operationChosen) {
            System.out.println("x = " + x + ".");
            System.out.println("y = " + y + ".");
            System.out.println("Please enter an operation - choose from -, + and *. Enter q to quit.");
            input = scanner.next();
            switch (input) {
                case "-":
                    output = x - y;
                    operationChosen = true;
                    break;
                case "+":
                    output = x + y;
                    operationChosen = true;
                    break;
                case "*":
                    output = x * y;
                    operationChosen = true;
                    break;
                case "q":
                    System.exit(-1);
            }
        }
        System.out.println("x " + input + " y = " + output);
    }
}
