package Jul8_Practice;

public class ReverseString {

	public static void main(String []args) {
		
		String s="newme";
		String r="";
		for(int i=s.length()-1;i>=0;i--) {
		//	System.out.println(s.charAt(i));
			r=r+s.charAt(i);
		}
		
		System.out.println(r);
		
	}
}
