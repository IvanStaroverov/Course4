package com.epam.ivan_staroverov.java.lesson1.task3;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Calculator application = new Calculator();
		application.enterNumbers();

	}
	public void enterNumbers() {
		double firstNumber, secondNumber;
		char operation;
		Scanner scanner = new Scanner(System.in);
		System.out.printf("First number = ");
		firstNumber = scanner.nextInt();
		System.out.printf("Second number = ");
		secondNumber = scanner.nextInt();
		
		System.out.printf("Choose the operation: +,-,*,/ \n");
		operation = scanner.next().charAt(0);
		scanner.close();	
		calculate(firstNumber,secondNumber,operation);
		}
	public void calculate(double firstNumber, double secondNumber, char operation) {
		switch (operation) {
		case '+':
			System.out.println(firstNumber + "+" + secondNumber + "=" + firstNumber + secondNumber);
			break;
		case '-':
			System.out.println(firstNumber + "-" + secondNumber + "=" + (firstNumber - secondNumber));
			break;
		case '*':
			System.out.println(firstNumber + "*" + secondNumber + "=" + firstNumber * secondNumber);
			break;
		case '/':
			System.out.println(firstNumber + "/" + secondNumber + "=" + firstNumber / secondNumber);
			break;
		default:
			System.out.println("Unknown operation");
	}		
	}
	
	
	
}
