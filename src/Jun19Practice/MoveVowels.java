package Jun19Practice;

public class MoveVowels {

	public static void main(String[] args) {
		// move vowels to left, consonants to middle, special character to right

		String s="ghy2u3&%$sjheu1";
		String conso="";
		String vowels="";
		String sp="";
		String n="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if((c>='A' && c<='Z') || (c>='a' && c<='z')) {
				
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ) {
				    
					vowels=vowels+c;
				}else {
					conso=conso+c;
				}
				
			}else if(c>='0' && c<='9') {
				n=n+c;
			}
			else {
				sp=sp+c;
			}
		}
		
		System.out.println("vowels "+vowels);
		System.out.println("conso "+conso);
		System.out.println("sp "+sp);
		String result= vowels+conso+sp+n;
		
		System.out.println(result);
	}
}