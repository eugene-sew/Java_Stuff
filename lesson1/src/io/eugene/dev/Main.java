package io.eugene.dev;

import java.util.Scanner;

//learning methods
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my basic java calculator");
        System.out.print("Enter first value : ");
        double firstValue = input.nextDouble();
        System.out.print("Enter second value : ");
        double secondValue = input.nextDouble();

        System.out.print("type/select the operation to perform(+,-,*,/): ");

        String operation = input.next();
        switch (operation.toLowerCase()) {
            case "+" -> System.out.println("the sum is: " + add(firstValue, secondValue));
            case "-" -> System.out.println("the difference is: " + subtraction(firstValue, secondValue));
            case "*" -> System.out.println("the product is : " + multiplication(firstValue, secondValue));
            case "/" -> System.out.println("the quotient after division is : " + division(firstValue, secondValue));
            default -> System.out.println("no operation selected");
        }
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtraction(double x, double y) {
        return x - y;
    }

    public static double multiplication(double x, double y) {
        return x * y;
    }

    public static double division(double x, double y) {
        return x / y;
    }
}
