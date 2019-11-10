package com.gost.yastrebov.task3;

import java.util.Map;
import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any text :");
        String text = scanner.nextLine();

        WordCounter counter = new WordCounter();
        Map<String, Integer> result =counter.countWords(text);
        System.out.println(result);
    }
}
