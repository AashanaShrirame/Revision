package Jun19Practice;

public class CharAccInString {

	public static void main(String[] args) {

		String s="aasha874j99";
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) >= 65 && s.charAt(i) <=90) {
				c++;
			}else if(s.charAt(i) >= 97 && s.charAt(i) <=122){
				c++;
			}
		}
		System.out.println(c);
	}

}
