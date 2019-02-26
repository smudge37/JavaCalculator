package com.company;

import java.util.ArrayList;

public interface Operation {
    int operate(ArrayList<Integer> operands);

    String getMathSymbol();
}
