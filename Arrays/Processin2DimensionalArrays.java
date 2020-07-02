package Arrayss;

import java.util.Scanner;

public class Processin2DimensionalArrays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matrix = new int[10][10];

		/*
		 * // 1-) initializing arrays with input values System.out.println("Enter " +
		 * matrix.length + " rows and " + matrix[0].length + "columns"); for (int i = 0;
		 * i < matrix.length; i++) { for (int j = 0; j < matrix[i].length; j++) {
		 * matrix[i][j] = input.nextInt(); } }
		 */

		// 2-) initializing 2-dimensional arrays with random value
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 100);
			}
		}

		// 3-) printing two-dimensional arrays
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// 4-) Summing all elements
		int total = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				total += matrix[i][j];
			}
		}

		// 5-) Summing elements by column
		for (int i = 0; i < matrix[0].length; i++) {
			int total1 = 0;
			for (int j = 0; j < matrix.length; j++) {
				total1 += matrix[j][i];
			}
			System.out.println("Sum for column " + i + " is " + total1);
		}

		// 6-) Which row has the largest sum ?
		int maxRowIndex = 0;
		int total2 = 0;
		for (int row = 0; row < matrix.length; row++) {
			int total3 = 0;
			for (int column = 0; column < matrix[row].length; column++) {

				total3 += matrix[row][column];

			}
			if (total3 > total2) {
				total2 = total3;
				maxRowIndex = row;
			}
		}
		System.out.println("Row " + maxRowIndex + " has the maximum sum of " + total2);

		// 7-)Random Shuffling
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int i1 = (int) (Math.random() * matrix.length);
				int j1 = (int) (Math.random() * matrix[i].length);
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i1][j1];
				matrix[i1][j1] = temp;
			}
		}
		input.close();
	}
}
