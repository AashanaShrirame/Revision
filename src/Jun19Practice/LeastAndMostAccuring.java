package Jun19Practice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

public class LeastAndMostAccuring {

	public static void main(String[] args) {

		String s = "anashe";
	//	int l = s.length();
		int m = 0;
		char lchar=s.charAt(0);
		char mchar=s.charAt(0);
		
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
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
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}			
			System.out.print(s.charAt(i) + " = " + count+" ,");

//		    if(count<l) {
//		    	l=count;
//		    	lchar=s.charAt(i);
//		    }
		    if(count>m){
		    	m=count;
		    	mchar=s.charAt(i);
		    }
			
		}
		System.out.println();
		System.out.print("acc "+ " "+m);
		
	 
	}

}


