package JavaCodingPractice15aug;

public class MoveVowels {

	public static void main(String[] args) {


		String s="ghy2u3&%$sjheu1";
		String vowels=""; String consonent=""; String special="";int n=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='A' && c<='Z' || c>='a' && c<='z') {
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
					vowels=vowels+c;
				}else {
					consonent=consonent+c;
				}
				
			}else if(c>='0' && c<='9') {
				n++;
			}else {
				special=special+c;
			}
			
		}

		System.out.println(vowels+" "+consonent+ " "+ special);
		System.out.println(s.length());
	}

}
