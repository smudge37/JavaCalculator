package com.company;

import java.util.ArrayList;

public class Multiply implements Operation {
    @Override
    public int operate(ArrayList<Integer> operands) {
        int product = 1;
        for (int number: operands) {
            product *= number;
        }
        return product;
    }

    @Override
    public String getMathSymbol() {
        return "*";
    }
}
