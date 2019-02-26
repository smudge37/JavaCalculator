package com.company;

import java.util.ArrayList;

public class Add implements Operation {
    @Override
    public int operate(ArrayList<Integer> operands) {
        int sum = 0;
        for (int number: operands) {
            sum += number;
        }
        return sum;
    }

    @Override
    public String getMathSymbol() {
        return "+";
    }
}
