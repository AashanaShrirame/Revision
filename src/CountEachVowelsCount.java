
public class CountEachVowelsCount {

	public static void main(String[] args) {

		String s = "aashioanai";

		for (int i = 0; i < s.length(); i++) {

			char m = s.charAt(i);
			boolean visited = false;
			if (m == 'a' || m == 'e' || m == 'i' || m == 'o' || m == 'u') {

				for (int k = 0; k < i; k++) {
					if (s.charAt(i) == s.charAt(k)) {
						visited = true;
						break;
					}
				}

				if (!visited) {
					int count = 1;
					for (int j = i + 1; j < s.length(); j++) {
						if (s.charAt(j) == m) {
							count++;
						}
					}
					System.out.println(s.charAt(i)+ " = "+count);

				}
				


			}

		}

	}
}
