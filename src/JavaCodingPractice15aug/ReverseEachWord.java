package JavaCodingPractice15aug;

public class ReverseEachWord {

	public static void main(String[] args) {

		String s = "Banglore is green city";
		
		String arr[] = s.split(" ");
		String line="";
		for(int i=0;i<arr.length;i++) {
			
			String word=arr[i];
			String r = "";
			for(int j=word.length()-1;j>=0;j--) {
				r=r+word.charAt(j);
			}
			
			line =line+r+" ";
		}
		
		System.out.println(line);
		if (line.trim().equals("erolgnaB si neerg ytic")) {
			System.out.println("eqal");
		} else {
			System.out.println("not equal");
		}
	}
}
