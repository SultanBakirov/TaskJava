package com.company.Exception;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double number = sqrt(scanner.nextInt());
            if (!((number) == (int) number)) {
                throw new Error();
            } else {
                System.out.println(number);
            }
        }
    }
}
