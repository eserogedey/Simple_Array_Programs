package Arrayss;

import java.util.Scanner;

//This program creates a array by taking items from user.Then ask for number of right rotation and shift the element right .
public class Rotation2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter item of array : ");
		String[] myList = scanner.nextLine().split(" ");

		int sizeOfArray = myList.length;

		System.out.println("Enter the number of right rotation");
		int rotation = scanner.nextInt();

		if (rotation % sizeOfArray == 0) {
			for (String a : myList) {
				System.out.print(a + " ");
			}
		} else {

			for (int z = 0; z < rotation % sizeOfArray; z++) {
				String temp = myList[myList.length - 1];

				for (int i = myList.length - 1; i > 0; i--) {

					myList[i] = myList[i - 1];

				}
				myList[0] = temp;

				for (String a : myList) {
					System.out.print(a + " ");
				}
			}
		}

	}
}
