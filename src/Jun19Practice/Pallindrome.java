package Jun19Practice;

public class Pallindrome {

	public static void main(String []args) {
		
		int num=1221;
		
//		String s="moodm";
//		String r="";
//		for(int i=s.length()-1;i>=0;i--) {
//			r=r+s.charAt(i);
//		}
//		
//		System.out.println(r);
	     int original = num;
		int r=0;
	
		while(num>0) {
			int rem=num%10;
			r=r*10+rem;
			num=num/10;
			
		}
		
		System.out.println(r);
		
	}
}
