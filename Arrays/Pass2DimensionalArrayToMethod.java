package Arrayss;

public class Pass2DimensionalArrayToMethod {
	public static void main(String[] args) {

		int[][] array = getArray();
		System.out.println("\n Sum of all elements : " + sum(array));
	}

	public static int[][] getArray() {
		int[][] m = new int[3][4];

		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter " + m.length + " row and " + m[0].length + " column");

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = scanner.nextInt();
			}
		}
		return m;

	}

	public static int sum(int[][] m) {
		int total = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				total += m[i][j];
			}
		}

		return total;
	}
}
