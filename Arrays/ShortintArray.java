package Arrayss;

public class ShortintArray {
	public static void main(String[] args) {
		int[] array = { 5, 4, 2, 3, 8, 9, 45, 78, 54, 0, 5, 8, 9, 555 };
		for (int i = 0; i < array.length - 1; i++) {
			int currentMin = array[i];
			int currentIndexOfMin = i;
			for (int j = i + 1; j < array.length; j++) {
				if (currentMin > array[j]) {
					currentMin = array[j];
					currentIndexOfMin = j;
				}
			}
			if (currentIndexOfMin != i) {
				array[currentIndexOfMin] = array[i];
				array[i] = currentMin;

			}

		}
		for (int a : array) {
			System.out.print(a + " ");
		}
	}
}
