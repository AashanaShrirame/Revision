package Jun19Practice;

public class CountAccurenceString {

	public static void main(String []args) {
		String s="aashana";
	
			
			
		for(int i=0;i<s.length();i++) {
			
			boolean visited=false;
			for(int k=0;k<i;k++) {
				if(s.charAt(i)==s.charAt(k)) {
					visited=true;
					break;
				}
			}
			
			if(visited==true) {
				continue;
			}
			
			int count =1;
		    for(int j=i+1;j<s.length();j++) {
		    	if(s.charAt(i)==s.charAt(j)) {
		    		count++;
		    	}
		    			
		    }
		    System.out.println(s.charAt(i) + " = " +count);
		    
		    
		}
	}
	
}
