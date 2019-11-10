package com.gost.yastrebov.task2;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any natural 'm' and 'r' (r <= m)");

        System.out.println("Enter 'm' :");
        int m = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter 'r' :");
        int r = Integer.parseInt(scanner.nextLine());

        Calculator calculator = new Calculator();
        System.out.println("Result : " + calculator.calculate(m,r));
    }
}
