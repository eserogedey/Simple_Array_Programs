package Arrayss;

public class shiftingElement {
	public static void main(String[] args) {
		int[] myList = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int temp = myList[0]; // retain the first element to exchange with last element

		for (int i = 1; i < myList.length; i++) {
			myList[i - 1] = myList[i];
		}
		myList[8] = temp;
		for (int a : myList) {
			System.out.print(a + " ");
		}
	}

}
