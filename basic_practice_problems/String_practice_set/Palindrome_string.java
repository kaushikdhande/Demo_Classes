package String_practice_set;

import java.util.*;
public class Palindrome_string {
		static void palindrome(String st) {
			String rev="";
			
			for(int i=st.length()-1;i>=0;i--) {
				rev+=st.charAt(i);
			}
//			System.out.println(rev);
			if(st.equals(rev)) {
				System.out.println("is plaindrome");
			}
			else {
				System.out.println("is not plaindrome");

			}
		}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter string :");
		String st=in.next();
		// TODO Auto-generated method stub
		
		palindrome(st);
		
	}

}
