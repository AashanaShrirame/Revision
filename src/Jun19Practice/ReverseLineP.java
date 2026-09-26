package Jun19Practice;

public class ReverseLineP {

	public static void main(String []args) {
		
		String s="Aashana Shrirame";
		
		String [] arr=s.split(" ");
		String r="";
		for(int i=arr.length-1;i>=0;i--) {
			r=r+arr[i] + " ";
		}
		
		System.out.println(r);
	}
}
