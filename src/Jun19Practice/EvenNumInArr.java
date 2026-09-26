package Jun19Practice;

public class EvenNumInArr {

	public static void main(String[] args) {
     
		int arr[] = {1,2,3,4,5,6};
		int even[]=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				System.out.print(arr[i]);
				even[index]=arr[i];
				index++;
				
				
			}
		}
		System.out.println("===");
		for(int i=0;i<index;i++) {
			System.out.print(even[i]);

			if(i<index-1) {
			System.out.print(",");
			}
			
		}

		String st="aashana";
		StringBuilder sb=new StringBuilder(st);
		String r=sb.reverse().toString();
		System.out.println();
		System.out.println(r);
		
		for(int i=st.length()-1;i>=0;i--) {
			System.out.print(st.charAt(i));
		}
		
		
	}

}
