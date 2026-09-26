package JavaCodingPractice15aug;

public class CountAccurenceInString {

	public static void main(String[] args) {

		String name = "Shriramei";

		for (int i = 0; i < name.length(); i++) {

			boolean visited=false;
			for(int k=0;k<i;k++) {
				if(name.charAt(i)==name.charAt(k)) {
					visited=true;
					break;
				}
			}
			
			if(visited==true) {
				continue;
			}
			
			int count = 1;
			for (int j = i + 1; j < name.length(); j++) {

				if (name.charAt(i) == name.charAt(j)) {
					count++;
				}

			}
			
			System.out.println(name.charAt(i) + " = "+count);
		}
	}
}
