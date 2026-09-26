package Jul8_Practice;

public class PallindromeString {

	public static void main(String[] args) {

		String s="a5sa";
		
		String r="";
		
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
		}
		
		System.out.println(r);
	}

}
