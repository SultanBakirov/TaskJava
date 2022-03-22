package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * Example tasks in JAVA
 * */

public class Main {

    public static void main(String[] args) {
        //task 1
//        System.out.println("    *    ");
//        System.out.println("  * * *  ");
//        System.out.println("* * * * *");
//        System.out.println("  * * *  ");
//        System.out.println("    *    ");
        //task 2
//        System.out.println("Azamat");
//        System.out.println("\t\toinogonu");
//        System.out.println("\t\t\t\t\tketti");
        //task 3
//        byte a = 127;
//        short b = 32767;
//        System.out.println(a + b);
        //task 4
//        Scanner scanner = new Scanner(System.in);
//        int c = scanner.nextByte();
//        int d = scanner.nextShort();
//        int i = scanner.nextInt();
//        System.out.println(c + d + i);
//        System.out.println(c * d * i);
//        System.out.printf("%.10f",(c + d + i) / 3f);
        //task 5
//        double a = 3.5;
//        System.out.println(a % 3);
        //task 6
//        Random random = new Random();
//        int a = random.nextInt(100,200);
//        int b = random.nextInt(100,200);
//        int c = random.nextInt(100,200);
//        System.out.println(a + b + c);
//        System.out.println((a + b + c) / 3 );
        //task 7
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        System.out.println("Hello " + name);
        //task 8
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        System.out.println((a * 60 * 60) + (b * 60) + c );
        //task 9
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = a % 10;
//        System.out.println(b);
//        int c = a / 10 % 10;
//        System.out.println(c);
//        int d = a / 10 / 10;
//        System.out.println(d);
//        System.out.println(d + "," + c + "," + b);
        //task 10
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        if (a > b) {
//            System.out.println(b);
//        } else {
//            System.out.println(a);
//        }
        //task 11
//        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//        if (num1 > num2 && num1 > num3) {
//            System.out.println(num1);
//        } else if (num2 > num3 && num2 > num1) {
//            System.out.println(num2);
//        } else {
//            System.out.println(num3);
//        }
        //task 12
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        String takeOrNotTake = age >= 18 ? "take": "notTake";
//        System.out.println(takeOrNotTake);
        //task 13
//        Scanner scanner = new Scanner(System.in);
//        String currency = scanner.nextLine();
//        switch (currency) {
//            case "USD":
//                System.out.println(84.8);
//                break;
//            case "EUR":
//                System.out.println(95.9);
//                break;
//            case "RUB":
//                System.out.println(1.14);
//                break;
//            case "KZT":
//                System.out.println(0.19);
//                break;
//        }
        //task 14
//        Scanner scanner = new Scanner(System.in);
//        int dayOfTheWeek = scanner.nextInt();
//        if (dayOfTheWeek == 1) {
//            System.out.println("Practical lesson");
//        } else if (dayOfTheWeek == 2) {
//            System.out.println("Session");
//        } else if (dayOfTheWeek == 3) {
//            System.out.println("Practical lesson");
//        } else if (dayOfTheWeek == 4) {
//            System.out.println("Session");
//        } else if (dayOfTheWeek == 5) {
//            System.out.println("Practical lesson");
//        } else if (dayOfTheWeek == 6 || dayOfTheWeek== 7) {
//            System.out.println("We don't have any lessons");
//        } else if (dayOfTheWeek >=8 ) {
//            System.out.println("There is no such day in the week !!!");
//        }
//
//        switch (dayOfTheWeek) {
//            case 1:
//                System.out.println("Practical lesson");
//                break;
//            case 2:
//                System.out.println("Session");
//                break;
//            case 3:
//                System.out.println("Practical lesson");
//                break;
//            case 4:
//                System.out.println("Session");
//                break;
//            case 5:
//                System.out.println("Practical lesson");
//                break;
//            case 6:
//                System.out.println("We don't have any lessons");
//                break;
//            case 7:
//                System.out.println("We don't have any lessons");
//                break;
//            default:
//                System.out.println("There is no such day in the week !!!");
//        }
        //task 15
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int counter = 0;
//        while (number > 0){
//            number /=10;
//            counter++;
//        }
//        System.out.println(counter);
        //task 16
//        Scanner scanner = new Scanner(System.in);
//        int number1 = scanner.nextInt();
//        int number2 = scanner.nextInt();
//        while (number1 < number2) {
//            number1++;
//            if (number1 == number2) {
//                break;
//            }
//            System.out.print(Math.pow(number1,2) + ", ");
//        }
        //task 17
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        while (a > 0) {
//            if (a % 2 == 0) {
//                System.out.println(a);
//            }
//            a--;
//        }
        //task 18
//        Scanner scanner = new Scanner(System.in);
//            int a;
//        do {
//            System.out.print("TYPE THE NUMBER: ");
//            a = scanner.nextInt();
//        } while (a >= 0);
//        System.out.println("BYE");
        //task 19
//       Scanner scanner = new Scanner(System.in);
//       int a = scanner.nextInt();
//       int b = scanner.nextInt();
//       while (a < b) {
//           if (a % 2 == 1) {
//               System.out.print(a + ", ");
//           }
//           a++;
//       }
        //task 20
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int counter = 0;
//        do {
//            counter+=a;
//            a--;
//            System.out.print(a + " + ");
//        } while (1 <= a);
//        System.out.println(" = " + counter);
        //task 21
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("5" + " * " + i + " = " + 5 * i);
//        }
        //task 22
//        int a = 2;
//        for (int i = 0; i < 10; i++) {
//            a *= 2;
//            System.out.println(a);
//        }
        //task 23
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int counter = 0;
//        for (int i = a; i < b; i++) {
//            if (i % 2 == 1) {
//                counter += i;
//            }
//        }
//        System.out.println(counter);
        //task 24
//        Scanner scanner = new Scanner(System.in);
//        int counter = 0;
//        int sum = 0;
//        for (; true ;) {
//            System.out.print("Type your number: ");
//            int input = scanner.nextInt();
//            if (input == 0) {
//                break;
//            }
//            counter++;
//            sum = sum + input;
//        }
//        System.out.println("Number of digits: " + counter);
//        System.out.println("Sum of digits: " + sum);
//        System.out.println("Arifmetic mean: " + (sum / counter));
        //task 25
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = 1;
//        for (int i = 1; i <= a; i++) {
//            b *= i;
//        }
//        System.out.printf("Factorial of %d = %d", a, b);
        //task 26
//        int[] array = new int[5];
//        array[0] = 123;
//        array[1] = 12435;
//        array[2] = 453;
//        array[3] = 1235;
//        array[4] = 56;
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + ", ");
//        }
        //task 27
//        Random random = new Random();
//        int[] intArray = new int[10];
//        int counter = 0;
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = random.nextInt(50);
//        }
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.print(intArray[i] + ", ");
//            counter += intArray[i];
//        }
//        System.out.println(" = " + counter / 10d);
        //task 28
//        Random random = new Random();
//        int[] array = new int[20];
//        int counter = 0;
//        int counter1 = 0;
//        int counter2 = 0;
//        int counter3 = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(100);
//            if (array[i] > 50) {
//                System.out.print("50 < " + array[i] + "; ");
//                counter1++;
//                counter += array[i];
//            }
//        }
//        System.out.println("\n" + counter);
//        System.out.println(counter1);
//        System.out.println(counter / counter1);
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 50) {
//                System.out.print("50 > " + array[i] + "; ");
//                counter2++;
//                counter3 += array[i];
//            }
//        }
//        System.out.println("\n" + counter3);
//        System.out.println(counter2);
//        System.out.println(counter3 / counter2);
        //task 29
//        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] % 2 ==0){
//                System.out.print(array[i] + ", ");
//            }
//        }
        //task 30
//        int[] array = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = array.length; i > 0; i--) {
//            System.out.println(i);
//        }
        //task 31
//        Scanner scanner = new Scanner(System.in);
//        switch (scanner.nextInt()) {
//            case 1:
//                hello();
//                System.out.print(" Arlen");
//                break;
//            case 2:
//                bye();
//                System.out.print(" Arlen");
//                break;
//            default:
//                System.exit(0);
//        }
        //task 32
//        multiplication();
        //task 33
//        name("Sultan");
        //task 34
//        array(new int[] {1,2,3,4,5,6,7,8,9});
        //task 35
//        sum(5,23);
        //task 36
//        num(10);
        //task 37
//        method1(new int[]{123,34,42,234,34,45,34});
//        method2(new int[]{123,34,42,234,34,45,34});
        //task 38
//        System.out.println(oddAndEven(27));
        //task 39
//        System.out.println(number(12,1,14));
        //task 40
//        System.out.println(totalSum(10));
        //task 41
//        System.out.println(array(new short[]{12,2,34,432,22}));
        //task 42
//        System.out.println(numberOf());
        //task 43
//        someMethod(10,23,2,25,3);
        //task 44
//        String[] name = new String[]{"Sultan", "Arlen", "Saparbai", "Aman"};
//        for (String nameOf: name) {
//            System.out.println("I love you " + nameOf + " !");
//        }
    }
    //task 43
    static void someMethod(int ... argument) {
        int counter = 0;
        for (int i = 0; i < argument.length; i++) {
            counter += argument[i];
        }
        System.out.println(counter);
    }
    //task 42
    static int numberOf() {
        int counter = 0;
        for (int i = 1; i < 300; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                counter += i;
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        return counter;
    }
    //task 41
    static short array(short[] num) {
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min){
                min = num[i];
            }
        }
        return (short)min;
    }
    //task 40
    static int totalSum(int a) {
        int counter = 0;
        for (int i = 0; i < a; i++) {
            counter += i;
        }
        return counter;
    }
    //task 39
    static int number(int a, int b, int c) {
        return (a + b + c) / 3;
    }
    //task 38
    static String oddAndEven(int a) {
        if (a % 2 == 1) {
            return "Odd number: " + a;
        } else
            return "Even number: " + a;
    }
    //task 37
    static void method1(int[] num1) {
        int min = num1[0];
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] < min) {
                min = num1[i];
                System.out.println(min);
            }
        }
    }
    static void method2(int[] num2) {
        int max = num2[0];
        for (int i = 0; i < num2.length; i++) {
            if (num2[i] > max) {
                max = num2[i];
            }
        }
        System.out.println(Arrays.toString(num2));
        System.out.println(max);
    }
    //task 36
    static void num(int a) {
        char b = '*';
        for (int i = 0; i < a; i++) {
            System.out.print(b + "; ");
        }
    }
    //task 35
    static void sum(int a, int b) {
        System.out.println((a + b) / 2);
    }
    //task 34
    static void array(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
    //task 33
    static void name(String name) {
        System.out.println("Hello " + name);
    }
    //task 32
    static void multiplication() {
        int counter = 1;
        for (int i = 2; i < 10; i++) {
            counter++;
            System.out.println("Multiplication of " + counter);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
    //task31
    static void hello() {
        System.out.print("Hello");
    }
    static void bye() {
        System.out.print("Bye");
    }
}
