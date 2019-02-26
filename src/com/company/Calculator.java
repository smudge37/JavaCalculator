package com.company;

import java.util.ArrayList;

public class Calculator {
    public void runCalculation() {
        CalculatorUI ui = new CalculatorUI();

        ArrayList<Integer> operands = ui.promptForOperands();

        Operation operation = ui.promptForOperation();
        int answer = operation.operate(operands);

        ui.printAnswer(operands, operation, answer);

        if (ui.userWantsNewCalculation()) {
            runCalculation();
        }
    }
}
