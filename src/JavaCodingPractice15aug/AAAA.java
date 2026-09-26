package JavaCodingPractice15aug;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class AAAA {

	public static void main(String[] args) {

		// Largest and most accuring value
		// most occuring second value

		int arr[] = { 3, 4, 7, 5, 3, 5, 6, 2, 5, 4, 4, 4, 4 };

		Arrays.sort(arr);

		int max = 0;
		int value = arr[0];
		int secondLargeCount = 0;
		int secondvalue = arr[0];

		for (int i = 0; i < arr.length; i++) {

			boolean visited = false;
			int count = 1;

			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					visited = true;
					break;
				}
			}

			if (visited == true) {
				continue;
			}

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
				}

			}
			System.out.println(arr[i] + " = " + count);
			if (count > max) {

				secondLargeCount = max;
				secondvalue = value;

				max = count;
				value = arr[i];

			}
			else if(count>secondLargeCount){
				secondLargeCount=count;
				secondvalue=arr[i];
			}
			
			

			
		}

		
		System.out.println("Larest Occuring is "+value+" with occurence "+max);
		System.out.println("Second Larest Occuring is "+secondvalue+" with occurence "+secondLargeCount);



	}
}
