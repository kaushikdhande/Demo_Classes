package String_practice_set;
import java.util.*;

public class Freaquency_in_string {
	
	static void count_char(String str) {
	Map<Character,Integer> mp=new HashMap<>();
	for(char ch:str.toCharArray()) {

		if(mp.containsKey(ch)) {
			mp.put(ch,mp.get(ch)+1);
		}
		else {
			mp.put(ch,1);
		}
	}
	for(Map.Entry<Character,Integer> charcount :mp.entrySet()) {
		System.out.println(charcount.getKey() +" : " + charcount.getValue() );
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=in.next();
		count_char(str);
//		
	}
	

}
