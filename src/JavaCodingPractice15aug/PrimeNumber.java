package JavaCodingPractice15aug;

public class PrimeNumber {

	public static void main(String[] args) {
		// Find prime number from 1 to 10  
		int n=3;
		int count=0;
		for(int i=1;i<=4;i++) {
			
			if(n%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("not");
		}

	}

}
