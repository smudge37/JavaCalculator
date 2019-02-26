package com.company;

public class Multiply implements Operation {
    @Override
    public int operate(int x, int y) {
        return x * y;
    }

    @Override
    public String getMathSymbol() {
        return "*";
    }
}
