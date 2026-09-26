package Jul8_Practice;

public class PallindromeNum {

	public static void main(String[] args) {
		
		int num=1223;
		int a=num;
       int r=0;
		while(num!=0) {
			
			int rem=num%10; 
			// 12 10+2  r =10 
			r= r*10+rem;
			
			num=num/10;
		}
		
		
		System.out.println(r);
		
	}

}
