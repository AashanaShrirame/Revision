package Jun19Practice;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {

		String name="aashana";
		String s="";
		for(int i=0;i<name.length();i++) {
			boolean visited=false;
			for(int j=0;j<i;j++) {
				if(name.charAt(i)==name.charAt(j)) {
					visited=true;
					break;
				}
			}
			
			if(visited==false) {
				s=s+name.charAt(i);
			}
		}
		System.out.println(s);


	}
}
