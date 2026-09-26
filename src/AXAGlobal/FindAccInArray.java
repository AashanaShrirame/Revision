package AXAGlobal;


public class FindAccInArray {

	public static void main(String[] args) {

		char s[]= {'a','a','s','h','a','n','a'};

		for (int i = 0; i < s.length; i++) {
			boolean visited = false;

			for (int k = 0; k < i; k++) {
				if (s[i] == s[k]) {
					visited = true;
					break;
				}
			}

			if (visited == true) {
				continue;
			}

			int count = 1;
			char c1 = s[i];
			for (int j = i + 1; j < s.length; j++) {
				char c2 = s[j];
				if (c1 == c2) {
					count++;
				}
			}

			System.out.println(s[i] + " = " + count);
		}

	}
}

