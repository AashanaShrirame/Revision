package JavaCodingPractice15aug;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortArray {

	public static void main(String[] args) {

		int arr[] = { 20, 2, 3, 1, 4, 5 , 2 };

		Set<Integer> set=new TreeSet<>();
		
		for(Integer i:arr) {
			set.add(i);
		}
		

		System.out.println(set);

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
	
		for(int i:arr) {
			System.out.print(i+ " ");
		}
	}

}
