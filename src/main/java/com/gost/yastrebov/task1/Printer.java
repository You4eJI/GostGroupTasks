package com.gost.yastrebov.task1;

public class Printer {
    public void printTwoSeven() {
        for (int i = 1; i <= 100; i++) {
            String output = "";

            if (i % 2 == 0)
                output += "Two";
            if (i % 7 == 0)
                output += "Seven";
            if (output.isEmpty())
                output += i;
            System.out.println(output);
        }
    }
}

