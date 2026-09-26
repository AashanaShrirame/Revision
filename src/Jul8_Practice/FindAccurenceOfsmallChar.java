package Jul8_Practice;

public class FindAccurenceOfsmallChar {

	public static void main(String[] args) {

		String s="sghs67FGSH";
		int count=0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
