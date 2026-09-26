package JavaCodingPractice15aug;

public class FindCaptalAndSmallLetterCount {

	public static void main(String[] args) {


		String s="aaAAShri";
		int small=0,capital=0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)>=65 && s.charAt(i)<=90) {
				small++;
			}else if(s.charAt(i)>=97 && s.charAt(i)<=122) {
				capital++;
			}
		}
		System.out.println(small);
		System.out.println(capital);
	}

}
