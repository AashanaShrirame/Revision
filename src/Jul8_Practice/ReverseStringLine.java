package Jul8_Practice;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Eager;

public class ReverseStringLine {

	public static void main(String[] args) {
		
		String line="Aashana ramesh SHrirame";
		
		String [] c=line.split(" ");
		String r="";
		String aa="";
		for(int i=c.length-1;i>=0;i--) {
			r=r+ c[i] + " ";
			
			String word=c[i];
			String eachword="";
			for(int j=word.length()-1;j>=0;j--) {
				eachword=eachword+ word.charAt(j);
			}
			
			aa=aa+eachword+" ";
		}
		
		System.out.println(r);
		System.out.println(aa);

	}

}
