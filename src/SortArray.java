import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,2,1};
		
//		Arrays.sort(arr);
//		
//		for(int j:arr) {
//			System.out.println(j);
//		}
		
		 for(int i=0;i<arr.length;i++) {
			
			 for(int j=i+1;j<arr.length;j++) {
				 
				 if(arr[i]>arr[j]) {
					 int temp = arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		}
		 
		 for(int x:arr) {
			 System.out.println(x);
		 }
	}

}
