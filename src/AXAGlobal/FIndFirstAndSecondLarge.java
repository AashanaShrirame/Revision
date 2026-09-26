package AXAGlobal;

public class FIndFirstAndSecondLarge {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		int first = arr[0];
		int second = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > first) {

				second = first;
				first = arr[i];
			} else if (arr[i] > second) {
				second = arr[i];
			}

		}
		System.out.println("first "+first);
		System.out.println("second "+second);
	}
}
