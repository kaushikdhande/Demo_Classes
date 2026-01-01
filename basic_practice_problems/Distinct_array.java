
import java.util.*;

public class Distinct_array {
	
	public static ArrayList <Integer> unique(int [] a) {
		HashSet<Integer> set =new HashSet<>();
		for(int num :a) {
			set.add(num);
		}
		return new ArrayList<>(set);
		}

	public static void main(String[] args) {
		int []a = {2, 2, 3, 7, 3, 5};
		ArrayList <Integer> res =unique(a);
		for(int n : res) {
			System.out.println(n);
		}
	}

}
