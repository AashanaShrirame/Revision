
public class SwapTwoNumbersWothoutThirdNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=100;
		int n2=200;
		
//		n2=n1+n2;
//		n1=n2-n1; //200
//		n2=n2-n1;  
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
	    System.out.println("n1 "+ n1);
		System.out.println("n2 "+ n2);
	}

}
