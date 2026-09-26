package JavaCodingPractice15aug;

public class LargestValueInArray {

	public static void main(String []args) {
		
		int arr[]= {2,3,10,40,5};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		
		System.out.println(max);
	}
}
