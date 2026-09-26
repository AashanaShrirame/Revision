package AXAGlobal;

public class FindSecondMostAccuringChar {

	public static void main(String[] args) {
		
		String s="shhhriramerrrr";
		
		int first=0;
		int second=0;
		
		char fc=s.charAt(0);
		char fs=s.charAt(0);
		
		for (int i = 0; i < s.length(); i++) {
			boolean visited = false;

			for (int k = 0; k < i; k++) {
				if (s.charAt(i) == s.charAt(k)) {
					visited = true;
					break;
				}
			}

			if (visited == true) {
				continue;
			}

			int count = 1;
			char c1 = s.charAt(i);
			for (int j = i + 1; j < s.length(); j++) {
				char c2 = s.charAt(j);
				if (c1 == c2) {
					count++;
				}
			}

			System.out.println(s.charAt(i) + " = " + count);
			
			if(count>first) {
				
				second=first;
				fs=fc;
				
				first=count;
				fc=s.charAt(i);
			}else if(count>second) {
				
				second=count;
				fs=s.charAt(i);
			}
		}

		System.out.println(fc+" first large occurs time = "+first);
		System.out.println(fs+" second large occurs time = "+second);
	}

}
