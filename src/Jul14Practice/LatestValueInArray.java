package Jul14Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LatestValueInArray {

	public static void main(String[] args) {
       
		int arr[]= {2,3,4,2,5,5};
			    
	    Map<Integer,Integer> map=new HashMap<>();
	    
	    for(int i=0;i<arr.length;i++) {
	    	
	    	if(map.containsKey(arr[i])) {
	    		map.put(arr[i], map.get(arr[i])+1);
	    	}else {
	    		map.put(arr[i], 1);
	    	}
	    }
	    System.out.println(map);
	    
	}
}
