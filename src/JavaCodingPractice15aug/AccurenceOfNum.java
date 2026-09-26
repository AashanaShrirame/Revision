package JavaCodingPractice15aug;

import java.util.HashMap;
import java.util.Map;

public class AccurenceOfNum {

	public static void main(String[] args) {
		
		
		int arr[]= {2, 4, 5, 2, 4, 2, 8};
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(Integer i:arr) {
			
			if(map.containsKey(i)) {
				map.put(i,map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		
		System.out.println(map);
		
	}

}
