package JavaCodingPractice15aug;

import java.util.HashMap;
import java.util.Map;

public class FindAccureneceOfNum {

	public static void main(String[] args) {


		int arr[]= {1,3,2,3,4,2,2,4,4};
	
		for(int i=0;i<arr.length;i++) {
			
			
			boolean visited=false;
			
			for(int k=0;k<i;k++) {
				if(arr[i]==arr[k]) {
					visited=true;
					break;
				}
			}
			
			if(visited==true) {
				continue;
			}
			
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			
			System.out.println(arr[i] + " = "+count);
		}
		
		int arr1[]= {1,3,2,3,4,2,2,4,4};
	    
	    Map<Integer,Integer> map=new HashMap<>();
	    
	    for(int i=0;i<arr1.length;i++) {
	    	
	    	if(map.containsKey(arr1[i])) {
	    		map.put(arr1[i], map.get(arr1[i])+1);
	    	}else {
	    		map.put(arr1[i], 1);
	    	}
	    }
	    System.out.println(map);
	    
	}

}
