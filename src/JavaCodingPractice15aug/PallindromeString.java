package JavaCodingPractice15aug;

public class PallindromeString {

	public static void main(String[] args) {


		int s=1221;
		int o=s;
        int n=0;
        
        System.out.println(s%10);
		while(s>0) {
			int temp=s%10;
			n=n*10+temp;
			s=s/10;
		
		}
        System.out.println(n);
		
	}

}
