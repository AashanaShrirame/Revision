package JavaCodingPractice15aug;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {

		String s = "aashanah";
		String uni = "";
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			boolean visited =false;
			for(int k=0;k<i;k++) {
				if(s.charAt(i)==s.charAt(k)) {
					visited=true;
					break;
				}
			}
			
			if(visited==true) {
				continue;
			}
			
			for(int j=i+1;j<s.length();j++) {
			if (s.charAt(i) == s.charAt(j)) {
				count++;
			}
			}
			
				uni = uni + s.charAt(i);
			
		}
		
		System.out.println(uni);

//		System.out.println(r);
//		
//		String s1="aashanah";
//		
//		Set<Character> set=new HashSet<>();
//		
//		for(Character c:s1.toCharArray()) {
//			set.add(c);
//		}
//		System.out.println(set);

	}
}
