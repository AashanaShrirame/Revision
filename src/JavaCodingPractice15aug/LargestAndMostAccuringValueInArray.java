package JavaCodingPractice15aug;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LargestAndMostAccuringValueInArray {

	public static void main(String[] args) {


		int arr[]= {1,2,3,4,5,2,3,2,2,2,2,2};
		
		Map<Integer,Integer> map=new TreeMap<>();
		
		for(Integer i:arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		
		System.out.println(map);
		
		System.out.println(((TreeMap<Integer,Integer>) map).lastKey());
		
		int max=0;
     	int k=0;
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()>max) {
				max=entry.getValue();
				k=entry.getKey();
			}
			
		}
		
		System.out.println(max);
		System.out.println(k);
		
		
		
		
	}

}
