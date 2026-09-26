package Jun19Practice;

public class LargestNumberInArrayP {

	public static void main(String []args) {
		
//		int arr[]= {3,4,2,40,3,37};
//		
//		int max=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		
//		System.out.println(max);
		
		int arr[]= {10,20,30};
		
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println(max);
	}
}
