package Arrayss;

import java.util.Scanner;

// The program find items in a array which are average of all items.
public class AnalyzeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int count = 0;

		System.out.print("Enter the number of item : ");
		int numberOfItem = input.nextInt();

		int[] myList = new int[numberOfItem];
		System.out.print("Enter the numbers : ");
		for (int i = 0; i < myList.length; i++) {
			myList[i] = input.nextInt();
			sum += myList[i];
		}
		double average = sum / numberOfItem;
		for (int j = 0; j < numberOfItem; j++) {
			if (myList[j] > average) {
				count++;
			}
		}

		System.out.println("Average is : " + average);
		System.out.println("Number of elements above the average is : " + count);
		input.close();

	}

}
