package JavaCodingPractice15aug;

import java.util.Arrays;

public class ReverseStringLineWord {

	public static void main(String []args) {
		
		String line="Nagarjuna is from Bangalore";
		
		String [] word=line.split(" ");
	String r="";
		for(int i=word.length-1;i>=0;i--) {
			
			
			
			if(i==0) {
				String temp=word[i];
				word[i]=word[word.length-1];
				word[word.length-1]=temp;
			}
		}
		
		for(String s:word) {
			r=r+s+" ";
		}
		
		System.out.println(r);

		
	}
}
