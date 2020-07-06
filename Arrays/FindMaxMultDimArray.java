package Arrayss;

import java.util.Scanner;

// this program give index number of max element in 2d array
public class FindMaxMultDimArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the row and column number");
		int row = scanner.nextInt();
		int column = scanner.nextInt();
		int[][] array = new int[row][column];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = scanner.nextInt();
			}
		}

		int maxValue = array[0][0];
		int maxIndex1 = 0;
		int maxIndex2 = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (maxValue < array[i][j]) {
					maxValue = array[i][j];
					maxIndex1 = i;
					maxIndex2 = j;
				}
			}
		}

		System.out.println("index of max element in array is " + maxIndex1 + " , " + maxIndex2);
	}
}
