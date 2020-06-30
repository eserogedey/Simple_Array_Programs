package Arrayss;

public class ShufflingArray {
	public static void main(String[] args) {
		int[] myList = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		for (int i = 0; i < myList.length - 1; i++) {
			int j = (int) (Math.random() * myList.length);
			int temp = myList[i];
			myList[i] = myList[j];
			myList[j] = temp;
		}

		for (int a : myList) {
			System.out.print(a + " ");
		}
	}

}
