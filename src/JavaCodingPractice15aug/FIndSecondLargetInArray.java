package JavaCodingPractice15aug;

public class FIndSecondLargetInArray {

	public static void main(String[] args) {


		int arr[]= {1,2,3,4,5};
		int max=0;
		int secmax=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		int iteration=1;
		for(int k=arr.length-1;k>=0;k--) {
			
			if(iteration==2) {
				System.out.println(arr[k]);
			}
			iteration++;
		}

	}

}
