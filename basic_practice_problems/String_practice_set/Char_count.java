package String_practice_set;
	
import java.util.*;
public class Char_count {
	
	public static void count(String str) {
	Map<Character,Integer> map=new HashMap<>();
	for(char c :str.toCharArray()) {
		map.put(c, map.getOrDefault(c,0)+1);
	}
	for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " = " + entry.getValue());
    	}	
	  }

	

	public static void main(String[] args) {
		String str="My name is Kaushik";
		count(str);
		
}
}