package AXAGlobal;

public class FindVowels {

	public static void main(String[] args) {
		
		String s="aashanai";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
//			
//			boolean visited=false;
//			for(int k=0;k<i;k++) {
//				if(c==s.charAt(k)) {
//					visited=true;
//				}
//			}
//			
//			if(visited==true) {
//				continue;
//			}
			
	    	int count=1;
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o'  || c == 'u'  ) {
				count++;
				
			}
			System.out.println(c +" = "+count);
		
		}

	}

}
