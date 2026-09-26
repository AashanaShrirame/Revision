package AXAGlobal;

public class FindOccurenceOfEachCharInString {

	public static void main(String[] args) {

		String s = "aashana";

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
		}

	}
}
