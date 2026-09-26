package Jul8_Practice;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		int [] arr= {20,30,4,5};
//	    Arrays.sort(arr);
//		
//		for(int n:arr) {
//			System.out.print(n);
//		}
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				
				int n=arr[j];
				arr[j]=arr[i];
				arr[i]=n;
				
			}
			}
		}
		
		
		for(int n:arr) {
			System.out.print(n +" ");
		}
		
	

	}

}
