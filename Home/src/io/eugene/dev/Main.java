package io.eugene.dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double num1,num2,answer;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        num2 = input.nextDouble();
        System.out.print("Enter operator (+,-,*)");
        String operator = input.next();

Operator opObject = new Operator();
        switch (operator){
            case "+":
                opObject.add(num1,num2);
                break;
            case "-":
                opObject.sub(num1,num2);
                break;
            case  "*":
                opObject.multiply(num1,num2);
                break;
            case "/"  :
                opObject.division(num1,num2);
                break;



        }


    }
}
