package com.company;
public class Calculator {
    public void runCalculation() {
        CalculatorUI ui = new CalculatorUI();

        System.out.println("Please enter the first integer to operate on.");
        int x = ui.promptForInteger();
        System.out.println("Please enter the second integer to operate on.");
        int y = ui.promptForInteger();

        Operation operation = ui.promptForOperation();
        int answer = operation.operate(x, y);

        ui.printAnswer(x, y, operation, answer);

        if (ui.userWantsNewCalculation()) {
            runCalculation();
        }
    }
}
