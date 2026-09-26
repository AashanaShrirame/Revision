package Jun19Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateUsingSet {

	public static void main(String[] args) {

		Integer [] arr = {2,2,3,1,2,3,4,5,5};
	
		List<Integer> list= Arrays.asList(arr);
		
		Set<Integer> set = new HashSet<Integer>(list);
		
		System.out.println(set);
		
		String []string= {"Aashana","Aashana","Shrirame","Shrirame"};
	//	List<String> list1=Arrays.asList(string);
		
		Set<String> set1=new HashSet<String>(Arrays.asList(string));
		
		System.out.println(set1);
		
		Integer[] arr2= {30,20,10,20,10,20};
		Set<Integer> set2=new TreeSet<Integer>(Arrays.asList(arr2));
		System.out.println(set2);
		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int n:arr2) {
			if(map.containsKey(n)) {
				map.put(n, map.get(n)+1);
			}else {
				map.put(n, 1);
			}
		}
		
		System.out.println(map);
		
	}

}

