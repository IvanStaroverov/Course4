package com.epam.ivan_staroverov.java.lesson1.task2;

import java.util.Scanner;

public class StringMassive {

	public static void main(String[] args) {
		StringMassive application = new StringMassive();
		application.createCharMassive();
	}
	public void createCharMassive() {
		int i,n;		
		System.out.println("Enter the number of strings:");		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		String[] stringMassive = new String[n+1];
		System.out.println("Enter the strings:");		
		for (i = 0; i<n+1;i++) {						
			stringMassive[i] = scanner.nextLine();						
		}		
		scanner.close();
		calculateMassive(stringMassive, n);
	}
		
	public void calculateMassive(String[] stringMassive,int n) {
		float stringLength = 0; //общая длина строк
		float averageLength = 0; // средняя длина строк
		int i;
		for (i=0; i<n+1; i++) {
			stringLength = stringLength + stringMassive[i].length();
		}
		averageLength = stringLength / n;		
		//Вывод необходимых данных
		System.out.print("Average string length = ");
		System.out.println(averageLength);
		System.out.println("Strings: ");
		for (i = 0; i<n+1;i++) {
			if (averageLength < stringMassive[i].length()) {
				System.out.println(stringMassive[i]);
			}									
		}
	}
	

}
