
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String p="aashana";
		String r="";
		
		for(int i=p.length()-1;i>=0;i--) {
			r=r+p.charAt(i);
		}
		System.out.println(r);
		
//		if(p.equals(r)) {
//			System.out.println("palli");
//		}else {
//			System.out.println("not");
//		}
		
		System.out.println(r);
		
	}

}
