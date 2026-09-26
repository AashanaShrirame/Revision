package JavaCodingPractice15aug;

public class MostAccuringSecondValue {

	public static void main(String[] args) {
		
	//	int arr[]= {2,2,2,2,2,2,3,3,4,4,4,5,5,5,5};
		int arr[]= { 3, 4, 7, 5, 3, 5, 6, 2, 5, 4, 4, 4, 4 };
		
		int max=0;
		int value=0;
		int secondLargeNum=0;
		int secondLarge=0;
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			boolean visited=false;
			for(int k=0;k<i;k++) {
				
				if(arr[i]==arr[k])
				{
					visited=true;
					break;
				}
			}
			
			if(visited==true) {
				continue;
			}
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			
			if(count>max) {
				
				secondLarge=max;
				secondLargeNum=value;
				
				max=count;
				value=arr[i];
				
				
				
			}
			else if(count >secondLarge) {
				secondLarge=count;
				secondLargeNum=arr[i];
			}
			

			
			System.out.println(arr[i] +" = "+count);
			
		}
		
		System.out.println("Larest Occuring is "+value+" with occurence "+max);
		System.out.println("Second Larest Occuring is "+secondLargeNum+" with occurence "+secondLarge);


	}

}
