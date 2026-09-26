
public class ReverseStringLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String line="Aashana Shrirame QA";
		
		String r_l="";
		String words[]=line.split(" ");
		
		for(int i=words.length-1;i>=0;i--) {
			r_l=r_l+words[i]+ " ";
		}
		
		System.out.println(r_l);
	}

}
