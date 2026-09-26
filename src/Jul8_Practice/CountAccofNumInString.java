package Jul8_Practice;

public class CountAccofNumInString {

public static void main(String []args) {
		
		String s="azir73o32";
		
		int count=0;
//		for(int i=0;i<s.length();i++) {
//			if(Character.isDigit(s.charAt(i))) {
//				count++;
//			}else {
//				continue;
//			}
//		}
		
		
		// Without method
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='0' && c<='9') {
				count++;
			}else {
				continue;
			}
		}
		
		System.out.println(count);
		
		
	}
}
