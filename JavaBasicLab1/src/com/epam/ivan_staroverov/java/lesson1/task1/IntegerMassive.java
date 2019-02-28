package com.epam.ivan_staroverov.java.lesson1.task1;

public class IntegerMassive {

	public static void main(String[] args) {
		IntegerMassive application = new IntegerMassive();
		application.createSumMassive();
	}
	public void createSumMassive() {
		int i;
		
		int[] integerMassive = new int[20];
		System.out.println("Massive:");
		for (i = 0; i<20; i++) {
			integerMassive[i] = (int) (Math.random()*22 - 11);	
			System.out.print(integerMassive[i]+" ");
			}	
		calculateMassive(integerMassive);
	}
	public void calculateMassive(int[] integerMassive) {
		int i;
		int sumEvenMassive = 0; //сумма четных элементов массива
		for (i = 0; i<20; i++) {
			if (i % 2 == 0) {
				sumEvenMassive = sumEvenMassive + integerMassive[i];
			}
		}
		System.out.println();
		System.out.print("Sum of integers=");
		System.out.print(sumEvenMassive);
		}

}
