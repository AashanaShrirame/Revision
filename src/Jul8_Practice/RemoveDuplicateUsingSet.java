package Jul8_Practice;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateUsingSet {

	public static void main(String[] args) {
		List<Integer> list =
				Arrays.asList(1,2,2,3,4,4);

				Set<Integer> set =
				new HashSet<>(list);

				System.out.println(set);
				
				List<String> s=Arrays.asList("aashana","shrirame","aashana");
				
				Set<String> r=new HashSet<>(s);
				
				System.out.println(r);
				
				List<Integer> in=Arrays.asList(2,3,4,3);
				
				Set<Integer> i=new HashSet<>(in);
				System.out.println(i);
				
				
	}

}
