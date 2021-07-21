package programs.arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 5, 6, 7, 4, 6 };

		int length = array.length;

		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (int a : array) {
			System.out.println(a);
		}
	}
}
