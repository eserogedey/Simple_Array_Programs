package Arrayss;

public class ProccessingArrays {
	public static void main(String[] args) {

		int[] myList = new int[10];
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.println("Enter " + myList.length + " values : ");

		for (int i = 0; i < myList.length; i++) {
			myList[i] = input.nextInt();
		}
		for (int a : myList) {
			System.out.print(a + " ");
		}

		// Finding max value in a array
		int max = myList[0];
		for (int a : myList) {
			if (max < a) {
				max = a;
			}
		}
		System.out.println();
		System.out.println("The max value of the array is " + max);

		// Finding min value in a array
		int max2 = myList[0];
		int indexOfMax = 0;
		for (int i = 1; i < myList.length; i++) {
			if (max2 < myList[i]) {
				max2 = myList[i];
				indexOfMax = i;
			}
		}
		System.out.println("The min value of the array is : " + indexOfMax);

		input.close();
	}

}
