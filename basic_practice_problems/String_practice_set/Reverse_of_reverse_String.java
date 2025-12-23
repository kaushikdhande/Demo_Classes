package String_practice_set;
import java.util.StringTokenizer;

public class Reverse_of_reverse_String {
	
		//reverse method
	 public static  String  reverse_Words(String s) {
		 String str_words[]=s.split(" ");
		 StringBuilder sb=new StringBuilder();
		 for(int i=str_words.length-1;i>=0;i--) {
			 sb.append(str_words[i] +" ");
//			 if(i > 0) {
//				 sb.append(" ");
//			 }
		 }
				return sb.toString();
				
			 
		 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i am Iron Man";
		
		char c[]=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(c[i]+"");		//naM norI ma i
		}
		
		System.out.println("------------------------------");
		
		
		String wordss[]=s.split(" ");
		String res=" ";
		for(String word :wordss) {												//I ma norI naM;
			for(int i=word.length()-1;i>=0;i--) {
				res+=word.charAt(i);
				
			}
			res+=" ";
			
		}
		System.out.println(res.trim());
		
		
		
		System.out.println("------------------------------");
		

		
			String m=reverse_Words(s);
			System.out.println(m);													//man iron am i
		}
		
	}



