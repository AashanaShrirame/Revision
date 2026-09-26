package Jun19Practice;

import java.util.Arrays;

public class SortArrayP {

	public static void main(String[] args) {

		int arr[] = {4,3,28,2,1};
		
	//	Arrays.sort(arr);
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
