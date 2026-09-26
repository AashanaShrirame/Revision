package Jul8_Practice;

public class LargestValueInArray {

	public static void main(String[] args) {

		int[] arr = {1,2,32,4,2};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println(max);
	}

}
