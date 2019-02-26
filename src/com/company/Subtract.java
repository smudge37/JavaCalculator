package com.company;

import java.util.ArrayList;

public class Subtract implements Operation {
    @Override
    public int operate(ArrayList<Integer> operands) {
        int result = operands.get(0);
        for (int i = 1; i < operands.size(); i++) {
            result -= operands.get(i);
        }
        return result;
    }

    @Override
    public String getMathSymbol() {
        return "-";
    }
}
