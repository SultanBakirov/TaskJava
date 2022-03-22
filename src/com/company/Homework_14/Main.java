package com.company.Homework_14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class clas = new Class(12,"Sultan",new int[]{12,34,654,76,78,67});
        System.out.println(clas.getNumber());
        System.out.println(clas.getWord());
        System.out.println(Arrays.toString(clas.getArray()));
        for (int array: clas.getArray()) {
            System.out.print(array + ", ");
        }
    }
}
